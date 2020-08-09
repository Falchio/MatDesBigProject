package com.github.falchio.materialdesign.ui.base_view;

import androidx.fragment.app.Fragment;

import com.github.falchio.materialdesign.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

abstract public class BaseFragment extends Fragment {
    private String title;

    @Override
    public void onResume() {
        super.onResume();
        CollapsingToolbarLayout collapsingToolbarLayout =requireActivity().findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(title);
        AppBarLayout appBarLayout = requireActivity().findViewById(R.id.app_bar_layout);
        appBarLayout.setExpanded(true);
    }
}
