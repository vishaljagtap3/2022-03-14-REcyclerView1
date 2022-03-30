package com.aavidsoft.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerCities;
    private ArrayList<String> citiesList;
    private CitiesAdapter citiesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {

        citiesList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            citiesList.add("Pune -- " + i);
        }

        recyclerCities = findViewById(R.id.recyclerCities);

        recyclerCities.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.HORIZONTAL,
                        false
                )
        );

        citiesAdapter = new CitiesAdapter(citiesList);
        recyclerCities.setAdapter(citiesAdapter);
    }
}