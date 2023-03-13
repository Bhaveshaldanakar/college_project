package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Maharashtra extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);

        ImageSlider imageSlider=findViewById(R.id.imageslider);
        ArrayList<SlideModel>slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.m1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m4, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

        imageView=findViewById(R.id.imageViewGateway);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Maharashtra.this,Mumbai.class));
            }
        });
        imageView=findViewById(R.id.imageViewMahableshwar);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Maharashtra.this,Mahableshwar.class));
            }
        });
        imageView=findViewById(R.id.imageViewPune);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Maharashtra.this,Pune.class));
            }
        });

        imageView=findViewById(R.id.imageViewRaigad);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Maharashtra.this,Raigad.class));
            }
        });
        imageView=findViewById(R.id.imageViewShirdi);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Maharashtra.this,Shirdi.class));
            }
        });


    }
}