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

        Button back = (Button) findViewById(R.id.guestBtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectMarket();
            }
        });

        Button login = (Button) findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogIn();
            }
        });

        Button account = (Button) findViewById(R.id.createActBtn);
        account.setOnClickListener(new View.OnClickListener() {
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