package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductDetail extends AppCompatActivity {

    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Button button = (Button) findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });

        Button button1 = (Button) findViewById(R.id.review_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });

        Button button2 = (Button) findViewById(R.id.add_cart);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });
    }

    public void addCart() {
        button2.setText("Added");
        button2.setEnabled(false);
    }

    public void openReview() {
        Intent intent = new Intent(this, Review.class);
        startActivity(intent);
    }

    public void openMenu() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}