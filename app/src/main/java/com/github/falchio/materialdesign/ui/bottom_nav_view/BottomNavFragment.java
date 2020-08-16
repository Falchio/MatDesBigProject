package com.github.falchio.materialdesign.ui.bottom_nav_view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

import com.github.falchio.materialdesign.R;
import com.github.falchio.materialdesign.ui.base_view.BaseFragment;
import com.github.falchio.materialdesign.ui.nature.NatureFragmentPage1;
import com.github.falchio.materialdesign.ui.nature.NatureFragmentPage2;
import com.github.falchio.materialdesign.ui.nature.NatureFragmentPage3;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomNavFragment extends BaseFragment {
    private String title = "Bottom Navigation";
    private FloatingActionButton fab;
    private int currentFragment;
    private String FRAGMENT_KEY = "frag";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        saveCurrentFragmentName("nav_river");
        return inflater.inflate(R.layout.fragment_bottom_nav_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FragmentManager fm = getParentFragmentManager();
        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_bottom_navigation_view);
        bottomNavView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_river:
                    fm.beginTransaction().replace(R.id.bottom_nav_fragment_host, new NatureFragmentPage2()).commit();
                    saveCurrentFragmentName("nav_river");
                    break;
                case R.id.nav_forest:
                    fm.beginTransaction().replace(R.id.bottom_nav_fragment_host, new NatureFragmentPage3()).commit();
                    saveCurrentFragmentName("nav_forest");
                    break;
                case R.id.nav_mountains:
                    fm.beginTransaction().replace(R.id.bottom_nav_fragment_host, new NatureFragmentPage1()).commit();
                    saveCurrentFragmentName("nav_mountains");
                    break;
            }
            return true;
        });

        if (savedInstanceState == null) {
            saveCurrentFragmentName("nav_river");
            bottomNavView.setSelectedItemId(currentFragment);
        }

        fab = requireActivity().findViewById(R.id.fab);
        fab.hide();
    }

    @Override
    public void onPause() {
        super.onPause();
        fab.show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt(FRAGMENT_KEY, currentFragment);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey(FRAGMENT_KEY)) {
            currentFragment = savedInstanceState.getInt(FRAGMENT_KEY);
        }
    }

    private void saveCurrentFragmentName(String nameFragment) {
        currentFragment = requireActivity().getResources().getIdentifier(nameFragment, "id", requireActivity().getPackageName());
    }
}