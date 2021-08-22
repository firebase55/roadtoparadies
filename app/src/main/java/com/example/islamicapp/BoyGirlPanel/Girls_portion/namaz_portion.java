package com.example.islamicapp.BoyGirlPanel.Girls_portion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazuQuiz.wazuQuizActivity;
import com.example.islamicapp.R;
import cn.pedant.SweetAlert.SweetAlertDialog;
public class namaz_portion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_portion);
    }

    public void play_animation(View view)
    {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.cartoon);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void namaz_quiz(View view)
    {
        Toast.makeText(getApplicationContext(), "namaz_quiz_for_girl", Toast.LENGTH_SHORT).show();
        new SweetAlertDialog(namaz_portion.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want to Attempt Quiz !")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Intent gameIntent = new Intent(getApplicationContext(), wazuQuizActivity.class);
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