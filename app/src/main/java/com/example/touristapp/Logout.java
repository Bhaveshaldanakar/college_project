package com.example.touristapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class Logout extends Fragment {


    public Logout() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_logout, container, false);


              AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),R.style.MyDailogTheme);
              builder.setTitle("Log Out");
              builder.setMessage("Are you sure you want to logout?");
              builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      Intent intent = new Intent(getActivity(), Login.class);
                      intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                      startActivity(intent);
                      getActivity().finish();

                  }
              });
              builder.setNegativeButton("No", null);
              AlertDialog dialog= builder.create();
              dialog.show();






        return view;
    }


}