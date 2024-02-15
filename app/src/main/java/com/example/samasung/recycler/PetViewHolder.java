package com.example.samasung.recycler;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;

import androidx.recyclerview.widget.RecyclerView;

import com.example.samasung.databinding.ItemPetBinding;
import com.example.samasung.domain.Pet;

public class PetViewHolder extends RecyclerView.ViewHolder {
    private ItemPetBinding binding;
    public PetViewHolder(ItemPetBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Pet pet) {
        binding.picture.setImageDrawable(pet.getImage());
        binding.breed.setText(pet.getBreed());
        binding.name.setText(pet.getName());
    }
}
