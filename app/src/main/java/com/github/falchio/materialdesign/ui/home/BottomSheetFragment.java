package com.github.falchio.materialdesign.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.github.falchio.materialdesign.R;
import com.github.falchio.materialdesign.ui.base_view.BaseFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomSheetFragment extends Fragment {
    private String title;


    private HomeViewModel homeViewModel;
    View bottomSheet;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        bottomSheet = root.findViewById(R.id.bottom_sheet);
        BottomSheetBehavior<View> bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_SETTLING);
        return root;
    }

    @Override
    public void onResume() {

        title=getString(R.string.bottom_sheet);
        super.onResume();
        CollapsingToolbarLayout collapsingToolbarLayout =requireActivity().findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(title);
        AppBarLayout appBarLayout = requireActivity().findViewById(R.id.app_bar_layout);
        appBarLayout.setExpanded(false);
        FloatingActionButton fab = requireActivity().findViewById(R.id.fab);
        fab.animate().translationY(0).setInterpolator(new LinearInterpolator()).start();
    }
}