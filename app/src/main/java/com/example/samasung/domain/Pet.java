package com.example.samasung.domain;

import android.graphics.drawable.Drawable;

public class Pet {
    private String name;
    private String breed;
    private String imageURL;
    private Drawable image;

    public Pet(String name, String breed, String imageURL) {
        this.name = name;
        this.breed = breed;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
