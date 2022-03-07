package com.example.prog03;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BodyActivity extends AppCompatActivity {
    EditText feet;
    EditText inches;
    EditText sex;
    EditText weight;
    EditText age;
    Button save;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_body);
        feet = findViewById(R.id.Feet);
        inches = findViewById(R.id.Inches);
        sex = findViewById(R.id.Sex);
        weight = findViewById(R.id.Weight);
        age = findViewById(R.id.Age);
        save = (Button) findViewById(R.id.SaveButton);
        back = (Button) findViewById(R.id.BackButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feet.setHint(feet.getText());
                inches.setHint(inches.getText());
                sex.setHint(sex.getText());
                weight.setHint(weight.getText());
                age.setHint(age.getText());
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
