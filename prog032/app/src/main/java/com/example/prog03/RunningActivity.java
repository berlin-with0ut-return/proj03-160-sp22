package com.example.prog03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class RunningActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_running);

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * In this tutorial, we add polylines and polygons to represent routes and areas on the map.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Add polylines to the map.
        // Polylines are useful to show a route or some other connection between points.
        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(37.876193, -122.259155),
                        new LatLng(37.87602777529239, -122.26036201360597),
                        new LatLng(37.879480029080234, -122.26109369876968),
                        new LatLng(37.878712727693944, -122.26688104678657),
                        new LatLng(37.874124098524305, -122.2662524099031),
                        new LatLng(37.874354304119244, -122.26465165406864),
                        new LatLng(37.8745742776823, -122.264023017162),
                        new LatLng(37.8752393100443, -122.25894207551896),
                        new LatLng(37.876193, -122.259155)));

        // Position the map's camera near Alice Springs in the center of Australia,
        // and set the zoom factor so most of Australia shows on the screen.
        mMap = googleMap;
        LatLng campus = new LatLng(37.876193, -122.259155);
        mMap.addMarker(new MarkerOptions().position(campus).title("Start"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(campus, 15));

    }
}