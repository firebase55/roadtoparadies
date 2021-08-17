package com.example.islamicapp.BoyGirlPanel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.islamicapp.BoyGirlPanel.boy.boyActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.FarzMaicActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.qibla.QiblaActivity;
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
}