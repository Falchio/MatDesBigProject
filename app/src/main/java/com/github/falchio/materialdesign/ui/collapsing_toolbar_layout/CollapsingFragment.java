package com.github.falchio.materialdesign.ui.collapsing_toolbar_layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.falchio.materialdesign.R;
import com.github.falchio.materialdesign.ui.base_view.BaseFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CollapsingFragment extends BaseFragment {
    private String title = "Collapsing Toolbar";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_collapsing_toolbar, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        AppBarLayout appBarLayout = requireActivity().findViewById(R.id.app_bar_layout);
        appBarLayout.setExpanded(true, true);
    }

    @Override
    public void onPause() {
        super.onPause();
        FloatingActionButton fab = requireActivity().findViewById(R.id.fab);
        fab.animate().translationY(0).setInterpolator(new LinearInterpolator()).start();
    }
}
