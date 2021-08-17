package com.example.islamicapp.BoyGirlPanel.boy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.islamicapp.BoyGirlPanel.farzPakage.FarzMaicActivity;
import com.example.islamicapp.R;

public class boyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy);
    }

    public void firstcard(View view)
    {
        Intent intent = new Intent(getApplicationContext(), FarzMaicActivity.class);
        startActivity(intent);
    }
}