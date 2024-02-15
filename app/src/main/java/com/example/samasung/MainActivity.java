package com.example.samasung;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.samasung.databinding.ActivityMainBinding;
import com.example.samasung.domain.Person;
import com.example.samasung.domain.Pet;
import com.example.samasung.recycler.PersonAdapter;
import com.example.samasung.recycler.PersonClickListener;
import com.example.samasung.recycler.PetAdapter;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
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

        try {
            initialize();
        } catch (Exception exception) {
            Toast.makeText(this, "Couldn't load image", Toast.LENGTH_SHORT).show();
        }

        PersonAdapter personAdapter = new PersonAdapter(this, people, new PersonClickListener() {
            @Override
            public void onClick(Person person) {
                binding.pets.setAdapter(new PetAdapter(person.getPets()));
            }
        });
        binding.people.setAdapter(personAdapter);

        PetAdapter petAdapter = new PetAdapter(people.get(0).getPets());
        binding.pets.setAdapter(petAdapter);
    }

    private void initialize() throws IOException {
        List<Pet> tempPets = new ArrayList<>();
        tempPets.add(new Pet("Doggy", "White dawgs", "dawg.jpg"));
        tempPets.add(new Pet("8cat", "Octocat", "octocat.png"));
        people.add(new Person(0, "Andrew", "+17284", tempPets));
        tempPets.clear();
        tempPets.add(new Pet("Octomeow", "Octocat", "octocat.png"));
        people.add(new Person(1, "Ben", "010", tempPets));

        for (Person person : people) {
            for (Pet pet : person.getPets()) {
                pet.setImage(Drawable.createFromStream(getAssets().open(pet.getImageURL()), null));
            }
        }
    }
}