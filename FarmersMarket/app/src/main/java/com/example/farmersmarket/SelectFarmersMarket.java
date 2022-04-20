package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectFarmersMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_farmers_market);

        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"South Berkeley - Tuesday", "North Berkeley - Thursday", "Downtown Berkeley - Saturday"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }


}