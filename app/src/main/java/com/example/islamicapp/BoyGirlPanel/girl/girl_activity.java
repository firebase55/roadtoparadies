package com.example.islamicapp.BoyGirlPanel.girl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.islamicapp.BoyGirlPanel.farzPakage.wazuQuiz.wazuQuizActivity;
import com.example.islamicapp.R;
import com.example.islamicapp.girl_five_list.Mainactivty_girl_portion;

public class girl_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl);
    }

    public void firstcard(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Mainactivty_girl_portion.class);
        startActivity(intent);
    }
}