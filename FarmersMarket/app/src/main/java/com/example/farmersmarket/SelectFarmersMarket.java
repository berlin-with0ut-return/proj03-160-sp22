package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SelectFarmersMarket extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    TextView newview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_farmers_market);

        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"South Berkeley - Tuesday", "North Berkeley - Thursday", "Downtown Berkeley - Saturday"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setSelection(0);
        dropdown.setOnItemSelectedListener(this);
        newview = findViewById(R.id.marketinfo);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseStand();
            }
        });
    }

    public void openChooseStand() {
        Intent intent = new Intent(this, ChooseStand.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        String text;
        switch (position) {
            case 0:
                displayMap(0);
                text = "Hours and Location: \nAdeline Street and 63rd Street \nTuesdays 2 pm - 6:30 pm year-round";
                createNewTextView(text);
                break;
            case 1:
                displayMap(1);
                text = "Hours and Location: \nShattuck Avenue @ Vine Street \nThursdays 3 pm - 7 pm year-round";
                createNewTextView(text);
                break;
            case 2:
                displayMap(2);
                text = "Hours and Location: \nCenter Street @ M. L. King, Jr. Way \nSaturdays 10 am - 3 pm year-round";
                createNewTextView(text);
                break;

        }
    }

    private void createNewTextView(String text) {
        newview.setText(text);
    }

    private void displayMap(int selection) {
        // TODO (MAX)
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

}