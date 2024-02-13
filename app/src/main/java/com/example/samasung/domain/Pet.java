package com.example.samasung.domain;

public class Pet {
    private String name;
    private String breed;
    private String imageURL;

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
}
