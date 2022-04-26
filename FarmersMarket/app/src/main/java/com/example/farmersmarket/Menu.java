package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button button = (Button) findViewById(R.id.button);
        CardView apple = (CardView) findViewById(R.id.appleCard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseStand();
            }
        });

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetail();
            }
        });
    }
    public void openChooseStand() {
        Intent intent = new Intent(this, ChooseStand.class);
        startActivity(intent);
    }

    public void openProductDetail() {
        Intent intent = new Intent(this, ProductDetail.class);
        startActivity(intent);
    }
}