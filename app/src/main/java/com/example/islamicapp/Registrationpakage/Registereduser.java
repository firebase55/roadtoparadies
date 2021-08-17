package com.example.islamicapp.Registrationpakage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.islamicapp.R;

public class Registereduser extends AppCompatActivity {
private TextView Login_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registereduser);
        Login_page = (TextView) findViewById(R.id.login_pagee);
        loginPage();//function Calling

    }
    public void loginPage()
    {
        Login_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoignIntent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(LoignIntent);
            }
        });
    }
}