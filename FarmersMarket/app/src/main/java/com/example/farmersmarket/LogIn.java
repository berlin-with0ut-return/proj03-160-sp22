package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {

    Button logIn;
    Button signUp;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        logIn = (Button) findViewById(R.id.LogInButton);
        signUp = (Button) findViewById(R.id.SignInButton);

        back = (Button) findViewById(R.id.BackButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToChooseStand();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSignUp();
            }
        });

    }

    private void goToSignUp() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
    private void goToChooseStand() {
        Intent intent = new Intent(this, ChooseStand.class);
        startActivity(intent);
    }
}