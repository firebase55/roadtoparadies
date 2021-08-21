package com.example.islamicapp.BoyGirlPanel.farzPakage.namaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.islamicapp.BoyGirlPanel.farzPakage.namazQuiz.NamazQuiz;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazu.wazuActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazuQuiz.wazuQuizActivity;
import com.example.islamicapp.R;
import com.example.islamicapp.Registrationpakage.Registereduser;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class nazamAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nazam_ativity);

    }

    public void playvideo(View view)
    {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.cartoon);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }


    public void quiz(View view)
    {
        new SweetAlertDialog(nazamAtivity.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want to Attempt Quiz !")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Intent intent = new Intent(getApplicationContext(),NamazQuiz.class);
                        startActivity(intent);

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