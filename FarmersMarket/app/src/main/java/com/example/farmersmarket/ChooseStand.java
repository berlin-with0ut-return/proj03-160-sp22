package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseStand extends AppCompatActivity {
    private Button button, button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_stand);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectMarket();
            }
        });

        button1 = (Button) findViewById(R.id.kaki_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMenu();
            }
        });
    }
    public void openSelectMarket() {
        // go backwards
        Intent intent = new Intent(this, SelectFarmersMarket.class);
        startActivity(intent);
    }

    public void goToMenu() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}