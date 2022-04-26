package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Button button = (Button) findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseStand();
            }
        });

        Button button1 = (Button) findViewById(R.id.review_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });
    }

    public void openReview() {
        Intent intent = new Intent(this, Review.class);
        startActivity(intent);
    }

    public void openChooseStand() {
        Intent intent = new Intent(this, ChooseStand.class);
        startActivity(intent);
    }
}