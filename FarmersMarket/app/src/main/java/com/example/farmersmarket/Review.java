package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        Button button = (Button) findViewById(R.id.back_button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetail();
            }
        });

        Button button1 = (Button) findViewById(R.id.submit_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetail();
            }
        });

    }

    public void openProductDetail() {
        Intent intent = new Intent(this, ProductDetail.class);
        startActivity(intent);
    }
}