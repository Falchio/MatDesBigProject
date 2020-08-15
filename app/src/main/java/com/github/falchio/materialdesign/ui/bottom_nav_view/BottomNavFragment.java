package com.github.falchio.materialdesign.ui.bottom_nav_view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.falchio.materialdesign.R;
import com.github.falchio.materialdesign.ui.base_view.BaseFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomNavFragment extends BaseFragment {
    private String title = "Bottom Navigation";
    FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom_nav_view, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        fab = requireActivity().findViewById(R.id.fab);
        fab.hide();

        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_bottom_navigation_view);
        bottomNavView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case
            }
            return true;
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        fab.show();
    }
}