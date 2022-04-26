package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    Button logIn;
    Button signUp;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        logIn = (Button) findViewById(R.id.SignInButton);
        signUp = (Button) findViewById(R.id.SignUpButton);

        back = (Button) findViewById(R.id.BackButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomeScreen();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSelectFarmersMarket();
            }
        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLogIn();
            }
        });

    }

    private void goToHomeScreen() {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    private void goToLogIn() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }
    private void goToSelectFarmersMarket() {
        Intent intent = new Intent(this, SelectFarmersMarket.class);
        startActivity(intent);
    }
}