package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
        dropdown.setOnItemSelectedListener(this);
        newview = findViewById(R.id.marketinfo);

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
//        final ConstraintLayout.LayoutParams lparams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        final TextView textView = new TextView(this);
//        newview.setLayoutParams(lparams);
        newview.setText(text);
//        return textView;
    }

    private void displayMap(int selection) {
        // TODO (MAX)
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

}