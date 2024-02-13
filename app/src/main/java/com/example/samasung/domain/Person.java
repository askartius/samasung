package com.example.samasung.domain;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private String phone;
    private List<Pet> pets;

    public Person(int id, String name, String phone, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Pet> getPets() {
        return pets;
    }
}
