package com.example.islamicapp.BoyGirlPanel.farzPakage.wazu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.islamicapp.BoyGirlPanel.farzPakage.quiz.quizActivity;
import com.example.islamicapp.R;

import java.util.Locale;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class wazuActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    String text;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wazu);
    }

    public void playvideo(View view) {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cartoon);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void speak_text(View view) {
        textToSpeech = new TextToSpeech(wazuActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    result = textToSpeech.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(wazuActivity.this, "Not Support in your device", Toast.LENGTH_SHORT).show();
                }
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(wazuActivity.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("Wudu (or Wudhu) is a cleansing ritual or ablution \n" +
                            "        that is an important part of purity and cleanliness in Islam before\n" +
                            "        performing worship. It follows a process to wash hands, mouth, nostrils,\n" +
                            "        arms, face, ears, hair and feet" , TextToSpeech.QUEUE_FLUSH, null);
                }

            }
        });
    }

    public void popUp(View view)
    {
        new SweetAlertDialog(wazuActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want Attempt Quiz !")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Intent gameIntent = new Intent(getApplicationContext(), quizActivity.class);
                        startActivity(gameIntent);

                    }
                })
                .setCancelText("No")
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();

                    }
                })
                .show();
    }
}