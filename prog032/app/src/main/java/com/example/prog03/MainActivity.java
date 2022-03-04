package com.example.prog03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton exerciseIcon, bodyDetailsIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exerciseIcon = (ImageButton) findViewById(R.id.exerciseIcon);
        bodyDetailsIcon = (ImageButton) findViewById(R.id.bodyDetailsIcon);

        exerciseIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAddExercise();
            }
        });

        bodyDetailsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBodyDetails();
            }
        });

    }
    private void goToAddExercise() {

        Intent intent = new Intent(this, ChooseActivity.class);
        startActivity(intent);
    }
    private void goToBodyDetails() {

        Intent intent = new Intent(this, BodyActivity.class);
        startActivity(intent);
    }
}