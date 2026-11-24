package com.example.examapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.examapp.databinding.FragmentPageBinding;

public class PageFragment extends Fragment {

    private static final String ARG_TITLE = "title";
    private static final String ARG_DESC = "description";

    private String title;
    private String description;
    private FragmentPageBinding binding;

    public PageFragment() {
    }

    public static PageFragment newInstance(String title, String description) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_DESC, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
            description = getArguments().getString(ARG_DESC);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPageBinding.inflate(inflater, container, false);

        if (title != null) {
            binding.tvTabTitle.setText(title);
        }
        if (description != null) {
            binding.tvTabDesc.setText(description);
        }

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
