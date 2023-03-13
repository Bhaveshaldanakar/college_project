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

public class Odisha extends AppCompatActivity {
    Button btn ,btn1 ,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha);
        ImageSlider imageSlider=findViewById(R.id.imageslider1);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.o1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.o2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.o3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.o4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.o5, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

        btn=findViewById(R.id.gateway_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Create a Uri object with the location data
                Uri uri = Uri.parse("geo:0,0?q=Konark Sun Temple, Konark, Odisha");
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
                Uri uri = Uri.parse("geo:0,0?q=Shri Jagannatha Temple Puri, Grand Road, At post, Puri, Odisha");
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
                Uri uri = Uri.parse("geo:0,0?q=Lingaraj temple, Lingaraj Temple Rd, Lingaraj Nagar, Old Town, Bhubaneswar, Odisha 751002");
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
                Uri uri = Uri.parse("geo:0,0?q=Golden Beach, Odisha");
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
                Uri uri = Uri.parse("geo:0,0?q=Smilipal National Park, Bhanjpur, Baripada, Odisha 757002");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });
    }
}