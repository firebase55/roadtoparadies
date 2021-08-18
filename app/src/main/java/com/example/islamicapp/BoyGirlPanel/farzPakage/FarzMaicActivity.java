package com.example.islamicapp.BoyGirlPanel.farzPakage;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.islamicapp.BoyGirlPanel.boygirlPanelActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.namaz.nazamAtivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.qibla.QiblaActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.quiz.quizActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazu.wazuActivity;
import com.example.islamicapp.R;
public class FarzMaicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farz_maic);
    }

    public void qibla(View view)
    {
        Intent intent = new Intent(getApplicationContext(), QiblaActivity.class);
        startActivity(intent);
    }

    public void wazu(View view)
    {
        Intent intent = new Intent(getApplicationContext(), wazuActivity.class);
        startActivity(intent);
    }

    public void namaz(View view)
    {
        Intent intent = new Intent(getApplicationContext(), nazamAtivity.class);
        startActivity(intent);
    }

    public void quiz(View view) {
        Intent intent = new Intent(getApplicationContext(), quizActivity.class);
        startActivity(intent);
    }

}