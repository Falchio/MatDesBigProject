package com.github.falchio.materialdesign.ui.fruits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.falchio.materialdesign.R;

import java.util.List;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.CardFruitsViewHolder> {
    private List<CardFruits> listCard;

    public FruitsAdapter(List<CardFruits> listCard) {
        this.listCard = listCard;
    }

    @NonNull
    @Override
    public CardFruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruits_item, parent, false);
        return new CardFruitsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardFruitsViewHolder holder, int position) {
        CardFruits currentCard = listCard.get(position);

        holder.title.setText(currentCard.getTitle());
        holder.description.setText(currentCard.getDescription());
        holder.imageView.setImageResource(currentCard.getImageID());

        View.OnClickListener onClickListener = v -> Toast.makeText(v.getContext(), "You clicked on card #" + (position + 1), Toast.LENGTH_SHORT).show();

        holder.imageView.setOnClickListener(onClickListener);
        holder.title.setOnClickListener(onClickListener);
        holder.description.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return listCard.size();
    }


    public static class CardFruitsViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView title;
        private TextView description;

        public CardFruitsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cardview_image);
            title = itemView.findViewById(R.id.cardview_title);
            description = itemView.findViewById(R.id.cardview_description);
        }
    }
}
