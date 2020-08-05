package com.github.falchio.materialdesign.ui.base_view;

import android.view.animation.LinearInterpolator;

import androidx.fragment.app.Fragment;

import com.github.falchio.materialdesign.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

abstract public class BaseFragment extends Fragment {
    private String title;

    @Override
    public void onResume() {
        super.onResume();
        CollapsingToolbarLayout collapsingToolbarLayout =requireActivity().findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(title);
        AppBarLayout appBarLayout = requireActivity().findViewById(R.id.app_bar_layout);
        appBarLayout.setExpanded(true);
        FloatingActionButton fab = requireActivity().findViewById(R.id.fab);
        fab.animate().translationY(0).setInterpolator(new LinearInterpolator()).start();
    }
}
