package com.example.examapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private final String[] titles = new String[]{"First", "Second", "Third"};
    private final String[] descriptions = new String[]{
            "Welcome to the first tab. Swipe left to explore more views.",
            "This is the second tab.\n(Press back to return to the first tab).",
            "This is the third tab.\n(Press back to return to the first tab)."
    };

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment.newInstance(titles[position], descriptions[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
