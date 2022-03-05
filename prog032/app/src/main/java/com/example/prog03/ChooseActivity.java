package com.example.prog03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {
    private Button running_button, biking_button, rowing_button, free_weights_button,
            stair_climbing_button, back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        running_button = (Button) findViewById(R.id.running_button);
        biking_button = (Button) findViewById(R.id.biking_button);
        rowing_button = (Button) findViewById(R.id.rowing_button);
        free_weights_button = (Button) findViewById(R.id.free_weights_button);
        stair_climbing_button = (Button) findViewById(R.id.stair_climbing_button);
        //back_button = (Button) findViewById(R.id.back_button);

        running_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRunning();
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


    /*
    * TODO: add intent to go to next page
    */
    private void goToRunning() {

        Intent intent = new Intent(this, RunningActivity.class);
        startActivity(intent);
    }
}