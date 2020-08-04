package com.github.falchio.materialdesign.ui.toolbar_demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.falchio.materialdesign.R;

public class ToolbarFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_toolbar, container, false);

        Button showButton = root.findViewById(R.id.show_progress_bar_button);
        Button hideButton = root.findViewById(R.id.hide_progress_bar_button);
        ProgressBar circularProgressBar = root.findViewById(R.id.progress_circular);
        ProgressBar horizontalProgressBar = root.findViewById(R.id.progress_horizontal);

        showButton.setOnClickListener(v -> {
            circularProgressBar.setVisibility(ProgressBar.VISIBLE);
            horizontalProgressBar.setVisibility(ProgressBar.VISIBLE);
        });

        hideButton.setOnClickListener(v -> {
            circularProgressBar.setVisibility(ProgressBar.INVISIBLE);
            horizontalProgressBar.setVisibility(ProgressBar.INVISIBLE);
        });
        return root;
    }
}
