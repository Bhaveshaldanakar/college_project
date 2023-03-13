package com.example.touristapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
Toolbar toolbar;
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        mAuth=mAuth.getInstance();
        mUser= mAuth.getCurrentUser();
        drawerLayout =findViewById(R.id.HomeImage);
        navigationView =findViewById(R.id.navigationview);
        toolbar =findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                if(id==R.id.LogOut){
                    loadfragment(new Logout());

                }//else if(id==R.id.LogOut){
                   // loadfragment(new Logout());

                //}
                else if(id==R.id.Map){
                    loadfragment(new mapsFragment());
                } else if(id==R.id.Weather){
                    loadfragment(new weather());
                }
                else
                {
                   loadfragment(new chat_bot());
                }
                    drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
        spinner=findViewById(R.id.spinner);
        List<String> categories= new ArrayList<>();
        categories.add(0,"Please Select a State");
        categories.add("AndhraPradesh");
        categories.add("ArunachalPradesh");
        categories.add("Assam");
        categories.add("Bihar");
        categories.add("Chhattisgarh");
        categories.add("Delhi");
        categories.add("Goa");
        categories.add("Gujarat");
        categories.add("Haryana");
        categories.add("HimachalPradesh");
        categories.add("Jharkhand");
        categories.add("Jammu and Kashmir");
        categories.add("Karanataka");
        categories.add("Kerala");
        categories.add("Ladakh");
        categories.add("MadhyaPradesh");
        categories.add("Maharashtra");
        categories.add("Manipur");
        categories.add("Meghalaya");
        categories.add("Mizoram");
        categories.add("Nagaland");
        categories.add("Odisha");
        categories.add("Punjab");
        categories.add("Rajasthan");
        categories.add("Sikkim");
        categories.add("TamilNadu");
        categories.add("Telegana");
        categories.add("Tripura");
        categories.add("Uttarakhand");
        categories.add("UttarPradesh");
        categories.add("WestBengal");


        ArrayAdapter<String> dataAdapter;
        dataAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Please Select a State")){
                    Toast.makeText(parent.getContext(), "Please Select a State", Toast.LENGTH_LONG).show();
                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    if(item=="Maharashtra"){
                        startActivity(new Intent(HomeActivity.this,Maharashtra.class));
                    }else if(item=="AndhraPradesh"){
                        startActivity(new Intent(HomeActivity.this,AndhraPradesh.class));
                    }else if(item=="ArunachalPradesh"){
                        startActivity(new Intent(HomeActivity.this,ArunachalPradesh.class));
                    }else if(item=="Assam"){
                        startActivity(new Intent(HomeActivity.this,Assam.class));
                    }else if(item=="Bihar"){
                        startActivity(new Intent(HomeActivity.this,Bihar.class));
                    }else if(item=="Chhattisgarh"){
                        startActivity(new Intent(HomeActivity.this,Chhattisgarh.class));
                    }else if(item=="Delhi"){
                        startActivity(new Intent(HomeActivity.this,Delhi.class));
                    }else if(item=="Goa"){
                        startActivity(new Intent(HomeActivity.this,Goa.class));
                    }else if(item=="Gujarat"){
                        startActivity(new Intent(HomeActivity.this,Gujarat.class));
                    }else if(item=="Haryana"){
                        startActivity(new Intent(HomeActivity.this,Haryana.class));
                    }else if(item=="HimachalPradesh"){
                        startActivity(new Intent(HomeActivity.this,HimachalPradesh.class));
                    }else if(item=="Jharkhand"){
                        startActivity(new Intent(HomeActivity.this,Jharkhand.class));
                    }else if(item=="Jammu and Kashmir"){
                        startActivity(new Intent(HomeActivity.this,JK.class));
                    }else if(item=="Karanataka"){
                        startActivity(new Intent(HomeActivity.this,Karanataka.class));
                    }else if(item=="Kerala"){
                        startActivity(new Intent(HomeActivity.this,Kerala.class));
                    }else if(item=="MadhyaPradesh"){
                        startActivity(new Intent(HomeActivity.this,MadhyaPradesh.class));
                    }else if(item=="Manipur"){
                        startActivity(new Intent(HomeActivity.this,Manipur.class));
                    }else if(item=="Meghalaya"){
                        startActivity(new Intent(HomeActivity.this,Meghalaya.class));
                    }else if(item=="Mizoram"){
                        startActivity(new Intent(HomeActivity.this,Mizoram.class));
                    }else if(item=="Nagaland"){
                        startActivity(new Intent(HomeActivity.this,Nagaland.class));
                    }else if(item=="Odisha"){
                        startActivity(new Intent(HomeActivity.this,Odisha.class));
                    }else if(item=="Ladakh"){
                        startActivity(new Intent(HomeActivity.this,Ladakh.class));
                    }else if(item=="Punjab"){
                        startActivity(new Intent(HomeActivity.this,Punjab.class));
                    }else if(item=="Rajasthan"){
                        startActivity(new Intent(HomeActivity.this,Rajasthan.class));
                    }else if(item=="Sikkim"){
                        startActivity(new Intent(HomeActivity.this,Sikkim.class));
                    }else if(item=="TamilNadu"){
                        startActivity(new Intent(HomeActivity.this,TamilNadu.class));
                    }else if(item=="Telegana"){
                        startActivity(new Intent(HomeActivity.this,Telegana.class));
                    }else if(item=="Tripura"){
                        startActivity(new Intent(HomeActivity.this,Tripura.class));
                    }else if(item=="Uttarakhand"){
                        startActivity(new Intent(HomeActivity.this,Uttarakhand.class));
                    }else if(item=="UttarPradesh"){
                        startActivity(new Intent(HomeActivity.this,UttarPradesh.class));
                    }else {
                        startActivity(new Intent(HomeActivity.this,WestBengal.class));
                    }


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        updateNavHeader();
    }

    private void updateUI(FirebaseUser currentUser) {
    }

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    private void loadfragment(Fragment fragment) {
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        ft.replace(R.id.container,fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void updateNavHeader() {

        navigationView =findViewById(R.id.navigationview);
        View headerView = navigationView.getHeaderView(0);
        TextView navUsername = headerView.findViewById(R.id.nav_username);
        TextView navUserMail = headerView.findViewById(R.id.nav_user_email);
        ImageView navUserPhoto = headerView.findViewById(R.id.user_reg_photo);

       try
       {
           navUserMail.setText(mUser.getEmail());
       }
       catch (Exception e) {
           Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
       }
        try {
            navUsername.setText(mUser.getDisplayName());
        } catch (Exception e) {
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }


        // now we will use Glide to load user image
        // first we need to import the library
        try {
            Glide.with(this).load(mUser.getPhotoUrl()).into(navUserPhoto);
        } catch (Exception e) {
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }


}