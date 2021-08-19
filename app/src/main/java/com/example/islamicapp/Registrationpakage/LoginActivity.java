package com.example.islamicapp.Registrationpakage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.islamicapp.BoyGirlPanel.biy_girl_panel.boygirlPanelActivity;
import com.example.islamicapp.R;

public class LoginActivity extends AppCompatActivity {
private Button Main_panel_boy_girl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Main_panel_boy_girl = (Button)findViewById(R.id.boy_girls_panel);
        onclick_function();

    }
    public void onclick_function()
    {
        Main_panel_boy_girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), boygirlPanelActivity.class);
                startActivity(intent);
            }
        });

    }
}