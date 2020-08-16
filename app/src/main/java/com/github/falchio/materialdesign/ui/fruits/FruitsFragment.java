package com.github.falchio.materialdesign.ui.fruits;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.falchio.materialdesign.R;
import com.github.falchio.materialdesign.ui.base_view.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class FruitsFragment extends BaseFragment {
    private String title = "Fruits";

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_fruits, container, false);

        List<CardFruits> fruitsList = new ArrayList<>();
        int imageId;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                imageId = R.drawable.fruits;
            } else {
                imageId = R.drawable.nature;
            }
            fruitsList.add(new CardFruits("Title: fruit #" + i, "Description: description #" + i, imageId));
        }

        RecyclerView rv = root.findViewById(R.id.recycler);
        if (rv != null) {
            rv.setHasFixedSize(true);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            rv.setLayoutManager(layoutManager);
            FruitsAdapter adapter = new FruitsAdapter(fruitsList);
            rv.setAdapter(adapter);
        }
        return root;
    }
}
