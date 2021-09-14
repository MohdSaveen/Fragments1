package com.example.fragments1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private ImageView mIvAnimal;


    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {

        mtvName=itemView.findViewById(R.id.tvName);
        mIvAnimal=itemView.findViewById(R.id.ivAnimal);

    }
    public void setData(AnimalModel animalModel){
        mtvName.setText(animalModel.getName());
        mIvAnimal.setImageResource(animalModel.getImageId());
    }

}
