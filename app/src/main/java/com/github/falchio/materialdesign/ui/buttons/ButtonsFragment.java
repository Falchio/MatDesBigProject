package com.github.falchio.materialdesign.ui.buttons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.github.falchio.materialdesign.R;

public class ButtonsFragment extends Fragment {

    private ButtonsViewModel buttonsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        buttonsViewModel =
//                ViewModelProviders.of(this).get(ButtonsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_buttons, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        buttonsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
}