package com.example.samasung.recycler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.recyclerview.widget.RecyclerView;

import com.example.samasung.databinding.ItemPetBinding;
import com.example.samasung.domain.Pet;

import java.io.File;

public class PetViewHolder extends RecyclerView.ViewHolder {
    private ItemPetBinding binding;
    public PetViewHolder(ItemPetBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Pet pet) {
        File source = new File(pet.getImageURL());
        Bitmap picture = BitmapFactory.decodeFile(source.getAbsolutePath());
        binding.picture.setImageBitmap(picture);
        binding.breed.setText(pet.getBreed());
        binding.name.setText(pet.getName());
    }
}
