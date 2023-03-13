package com.example.touristapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Meghalaya extends AppCompatActivity {
    Button btn ,btn1 ,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meghalaya);
        ImageSlider imageSlider=findViewById(R.id.imageslider1);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mg1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.mg2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.mg3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.mg4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.mg5, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);



        btn=findViewById(R.id.gateway_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Create a Uri object with the location data
                Uri uri = Uri.parse("geo:0,0?q=7M2C+GQ5, Nongriat, Meghalaya 793111");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });

        btn1=findViewById(R.id.location_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Create a Uri object with the location data
                Uri uri = Uri.parse("geo:0,0?q=CWX5+GHH, Meghalaya 793015");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });
        btn2=findViewById(R.id.location_btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Create a Uri object with the location data
                Uri uri = Uri.parse("geo:0,0?q=Umiam Lake, Umiam, Meghalaya");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });
        btn3=findViewById(R.id.location_btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Create a Uri object with the location data
                Uri uri = Uri.parse("geo:0,0?q=6PVF+RJG, Cherrapunji, Meghalaya 793108");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });
        btn4=findViewById(R.id.location_btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Create a Uri object with the location data
                Uri uri = Uri.parse("geo:0,0?q=GRPC+CXH, Upper Shillong, Shillong, Meghalaya 793009");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });

    }
}