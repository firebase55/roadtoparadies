package com.example.islamicapp.BoyGirlPanel.biy_girl_panel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.islamicapp.BoyGirlPanel.boy.boyActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.FarzMainActivity.FarzMaicActivity;
import com.example.islamicapp.BoyGirlPanel.girl.girl_activity;
import com.example.islamicapp.R;

public class boygirlPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boygirl_panel);
    }

    public void boy_id(View view)
    {
        Intent intent = new Intent(getApplicationContext(), boyActivity.class);
        startActivity(intent);
    }

    public void girl_panel(View view)
    {
        Intent intent = new Intent(getApplicationContext(), girl_activity.class);
        startActivity(intent);

    }
}