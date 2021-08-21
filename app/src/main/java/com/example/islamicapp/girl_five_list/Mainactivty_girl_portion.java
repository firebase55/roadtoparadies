package com.example.islamicapp.girl_five_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.islamicapp.BoyGirlPanel.Girls_portion.namaz_portion;
import com.example.islamicapp.BoyGirlPanel.Girls_portion.wazu_portion;
import com.example.islamicapp.BoyGirlPanel.farzPakage.dua.duaMAinActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.namazpkg.namazz;
import com.example.islamicapp.BoyGirlPanel.farzPakage.qibla.QiblaActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.quiz.quizActivity;
import com.example.islamicapp.R;

public class Mainactivty_girl_portion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivty_girl_portion);
    }
    public void qibla(View view)
    {
        Intent intent = new Intent(getApplicationContext(), QiblaActivity.class);
        startActivity(intent);
    }

    public void wazu(View view)
    {
        Intent intent = new Intent(getApplicationContext(), wazu_portion.class);
        startActivity(intent);
    }

    public void namaz(View view)
    {
        Intent intent = new Intent(getApplicationContext(), namaz_portion.class);
        startActivity(intent);
    }

    public void quiz(View view) {
        Intent intent = new Intent(getApplicationContext(), quizActivity.class);
        startActivity(intent);
    }

    public void dua(View view)
    {
        Intent intent = new Intent(getApplicationContext(), duaMAinActivity.class);
        startActivity(intent);

    }
}