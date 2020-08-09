package com.github.falchio.materialdesign.ui.fruits;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.falchio.materialdesign.R;
import com.github.falchio.materialdesign.ui.base_view.BaseFragment;

public class FruitsFragment extends BaseFragment {
    private String title="Fruits";

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fruits, container, false);
    }
}
