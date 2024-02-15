package com.example.samasung.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.samasung.R;
import com.example.samasung.databinding.ItemPersonBinding;
import com.example.samasung.domain.Person;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {
    private PersonClickListener clickListener;

    public PersonAdapter(@NonNull Context context, @NonNull List<Person> people, PersonClickListener clickListener) {
        super(context, R.layout.item_person, people);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Person person = getItem(position);

        ItemPersonBinding binding = ItemPersonBinding.inflate(LayoutInflater.from(getContext()));

        binding.id.setText(String.valueOf(person.getId()));
        binding.name.setText(person.getName());
        binding.phone.setText(person.getPhone());

        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(person);
            }
        });

        return binding.getRoot();
    }
}
