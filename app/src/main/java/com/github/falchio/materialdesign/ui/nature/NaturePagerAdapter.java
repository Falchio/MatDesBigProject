package com.github.falchio.materialdesign.ui.nature;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class NaturePagerAdapter extends FragmentPagerAdapter {

    public NaturePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) throws NullPointerException {
        switch (position) {
            case (0):
                return new NatureFragmentPage1();

            case (1):
                return new NatureFragmentPage2();

            case (2):
                return new NatureFragmentPage3();

            default:
                return new NatureFragmentPage3();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
