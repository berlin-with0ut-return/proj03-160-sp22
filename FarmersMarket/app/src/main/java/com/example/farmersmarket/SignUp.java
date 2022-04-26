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
        setContentView(R.layout.activity_log_in);

        logIn = (Button) findViewById(R.id.LogInButton);
        signUp = (Button) findViewById(R.id.SignUpButton);

        back = (Button) findViewById(R.id.BackButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChooseStand();
            }
        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLogIn();
            }
        });

    }

    private void goToLogIn() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }
    private void goToChooseStand() {
        Intent intent = new Intent(this, ChooseStand.class);
        startActivity(intent);
    }
}