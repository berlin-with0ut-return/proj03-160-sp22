package com.example.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class SelectFarmersMarket extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {
    TextView newview;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_farmers_market);

        // Map Stuff
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"South Berkeley - Tuesday", "North Berkeley - Thursday", "Downtown Berkeley - Saturday"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setSelection(0);
        dropdown.setOnItemSelectedListener(this);
        newview = findViewById(R.id.marketinfo);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseStand();
            }
        });
    }

    public void openChooseStand() {
        Intent intent = new Intent(this, ChooseStand.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        String text;
        switch (position) {
            case 0:

                text = "Hours and Location: \nAdeline Street and 63rd Street \nTuesdays 2 pm - 6:30 pm year-round";
                createNewTextView(text);
                break;
            case 1:
                displayMap(1);
                text = "Hours and Location: \nShattuck Avenue @ Vine Street \nThursdays 3 pm - 7 pm year-round";
                createNewTextView(text);
                break;
            case 2:
                displayMap(2);
                text = "Hours and Location: \nCenter Street @ M. L. King, Jr. Way \nSaturdays 10 am - 3 pm year-round";
                createNewTextView(text);
                break;

        }
    }

    private void createNewTextView(String text) {
        newview.setText(text);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Position the map's camera
        mMap = googleMap;
        LatLng north = new LatLng(37.880266, -122.269251);
        LatLng south = new LatLng(37.847737, -122.271956);
        LatLng downtown = new LatLng(37.869797, -122.271868);
        LatLng centerish = new LatLng(37.870880, -122.267736);
        mMap.addMarker(new MarkerOptions().position(north).title("North Berkeley Farmers' Market"));
        mMap.addMarker(new MarkerOptions().position(south).title("South Berkeley Farmers' Market"));
        mMap.addMarker(new MarkerOptions().position(downtown).title("Downtown Berkeley Farmers' Market"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centerish, 15));


    }

    private void displayMap(int index) {

        LatLng north = new LatLng(37.880266, -122.269251);
        LatLng south = new LatLng(37.847737, -122.271956);
        LatLng downtown = new LatLng(37.869797, -122.271868);
        if (index == 0) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(south, 15));
        } else if (index == 1) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(north, 15));
        } else {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(downtown, 15));
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

}