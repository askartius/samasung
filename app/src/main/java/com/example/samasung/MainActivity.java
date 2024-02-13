package com.example.samasung;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.samasung.databinding.ActivityMainBinding;
import com.example.samasung.domain.Person;
import com.example.samasung.domain.Pet;
import com.example.samasung.recycler.PersonAdapter;
import com.example.samasung.recycler.PetAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initialize();

        PersonAdapter personAdapter = new PersonAdapter(this, people);
        binding.people.setAdapter(personAdapter);

        PetAdapter petAdapter = new PetAdapter(people.get(0).getPets());
        binding.pets.setAdapter(petAdapter);
    }

    private void initialize() {
        people.add(new Person(0, "Andrew", "+17284", Collections.singletonList(new Pet("Doggy", "White dawgs", "res/drawable/dawg.jpg"))));
        people.add(new Person(1, "Ben", "010", Collections.singletonList(new Pet("Octomeow", "Octocat", "res/drawable/octocat.png"))));
    }
}