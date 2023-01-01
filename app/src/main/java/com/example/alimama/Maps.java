package com.example.alimama;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    MarkerOptions store;
    double latitude1 = -1.189217159851009;
    double longitude1 = 36.93250042710715;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        store = new MarkerOptions().position(new LatLng(latitude1, longitude1)).title("Alimama Electronics");
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.addMarker(store);

        CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(latitude1, longitude1));
        CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
    }
}