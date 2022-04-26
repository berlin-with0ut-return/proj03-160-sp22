package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button button = (Button) findViewById(R.id.guestBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectMarket();
            }
        });

        Button button1 = (Button) findViewById(R.id.loginBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogIn();
            }
        });

        Button button2 = (Button) findViewById(R.id.createActBtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
    }

    public void openSelectMarket() {
        Intent intent = new Intent(this, SelectFarmersMarket.class);
        startActivity(intent);
    }

    public void openLogIn() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }

    public void openSignUp() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}