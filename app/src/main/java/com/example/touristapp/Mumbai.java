package com.example.touristapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mumbai extends AppCompatActivity {

    Button btn ,btn1 ,btn2,btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);
        btn=findViewById(R.id.gateway_btn);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

// Create a Uri object with the location data
               Uri uri = Uri.parse("geo:0,0?q=Gateway Of India Mumbai\n" +
                       "Apollo Bandar, Colaba, Mumbai, Maharashtra 400001\n");
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
                Uri uri = Uri.parse("geo:0,0?q=WRQM+XVM CST Railway Station, Dhobi Talao, Chhatrapati Shivaji Terminus Area, Fort, Mumbai, Maharashtra 400001");
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
                Uri uri = Uri.parse("geo:0,0?q=2R8J+P4J Shree Siddhivinayak Temple, SK Bole Marg, Prabhadevi, Mumbai, Maharashtra 400028");
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
                Uri uri = Uri.parse("geo:0,0?q=Sanjay Gandhi National Park, National Park New, Western Express Hwy, Rajendra Nagar Society, Kulupwadi, Borivali East, Mumbai, Maharashtra 400066");
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
                Uri uri = Uri.parse("geo:0,0?q=6RH4+78M Pagoda, Global Pagoda Road, Essel world Amusement Park, Gorai, Mumbai, Maharashtra 400092");
// Launch the Google Maps app with the Uri
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

            }
        });





    }




}