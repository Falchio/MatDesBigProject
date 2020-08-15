package com.github.falchio.materialdesign.ui.nature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

class NaturePagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList = new ArrayList<>();
    List<String> titleList = new ArrayList<>();


    public NaturePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        fragmentList.add(new NatureFragmentPage1());
        fragmentList.add(new NatureFragmentPage2());
        fragmentList.add(new NatureFragmentPage3());

        titleList.add("Mountains");
        titleList.add("River");
        titleList.add("Forest");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) throws NullPointerException {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
