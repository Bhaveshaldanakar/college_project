package com.example.touristapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;


public class Home extends Fragment {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    FirebaseAuth mAuth;
    FirebaseUser mUser;
   private Spinner spinner;

    public Home() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



       View view= inflater.inflate(R.layout.fragment_trips, container, false);
        spinner=view.findViewById(R.id.spinner);
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
        dataAdapter=new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item,categories);
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
                        startActivity(new Intent(getActivity(),Maharashtra.class));
                    }else if(item=="AndhraPradesh"){
                        startActivity(new Intent(getActivity(),AndhraPradesh.class));
                    }else if(item=="ArunachalPradesh"){
                        startActivity(new Intent(getActivity(),ArunachalPradesh.class));
                    }else if(item=="Assam"){
                        startActivity(new Intent(getActivity(),Assam.class));
                    }else if(item=="Bihar"){
                        startActivity(new Intent(getActivity(),Bihar.class));
                    }else if(item=="Chhattisgarh"){
                        startActivity(new Intent(getActivity(),Chhattisgarh.class));
                    }else if(item=="Delhi"){
                        startActivity(new Intent(getActivity(),Delhi.class));
                    }else if(item=="Goa"){
                        startActivity(new Intent(getActivity(),Goa.class));
                    }else if(item=="Gujarat"){
                        startActivity(new Intent(getActivity(),Gujarat.class));
                    }else if(item=="Haryana"){
                        startActivity(new Intent(getActivity(),Haryana.class));
                    }else if(item=="HimachalPradesh"){
                        startActivity(new Intent(getActivity(),HimachalPradesh.class));
                    }else if(item=="Jharkhand"){
                        startActivity(new Intent(getActivity(),Jharkhand.class));
                    }else if(item=="Jammu and Kashmir"){
                        startActivity(new Intent(getActivity(),JK.class));
                    }else if(item=="Karanataka"){
                        startActivity(new Intent(getActivity(),Karanataka.class));
                    }else if(item=="Kerala"){
                        startActivity(new Intent(getActivity(),Kerala.class));
                    }else if(item=="MadhyaPradesh"){
                        startActivity(new Intent(getActivity(),MadhyaPradesh.class));
                    }else if(item=="Manipur"){
                        startActivity(new Intent(getActivity(),Manipur.class));
                    }else if(item=="Meghalaya"){
                        startActivity(new Intent(getActivity(),Meghalaya.class));
                    }else if(item=="Mizoram"){
                        startActivity(new Intent(getActivity(),Mizoram.class));
                    }else if(item=="Nagaland"){
                        startActivity(new Intent(getActivity(),Nagaland.class));
                    }else if(item=="Odisha"){
                        startActivity(new Intent(getActivity(),Odisha.class));
                    }else if(item=="Ladakh"){
                        startActivity(new Intent(getActivity(),Ladakh.class));
                    }else if(item=="Punjab"){
                        startActivity(new Intent(getActivity(),Punjab.class));
                    }else if(item=="Rajasthan"){
                        startActivity(new Intent(getActivity(),Rajasthan.class));
                    }else if(item=="Sikkim"){
                        startActivity(new Intent(getActivity(),Sikkim.class));
                    }else if(item=="TamilNadu"){
                        startActivity(new Intent(getActivity(),TamilNadu.class));
                    }else if(item=="Telegana"){
                        startActivity(new Intent(getActivity(),Telegana.class));
                    }else if(item=="Tripura"){
                        startActivity(new Intent(getActivity(),Tripura.class));
                    }else if(item=="Uttarakhand"){
                        startActivity(new Intent(getActivity(),Uttarakhand.class));
                    }else if(item=="UttarPradesh"){
                        startActivity(new Intent(getActivity(),UttarPradesh.class));
                    }else {
                        startActivity(new Intent(getActivity(),WestBengal.class));
                    }


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        return view;


    }

}
