package com.example.islamicapp.BoyGirlPanel.farzPakage.namazpkg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.islamicapp.BoyGirlPanel.farzPakage.namazQuiz.NamazQuiz;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazu.wazuActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazuQuiz.wazuQuizActivity;
import com.example.islamicapp.R;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.pedant.SweetAlert.SweetAlertDialog;
////
//
public class namazz extends AppCompatActivity {
    TimePicker timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazz);
//        Switch aSwitch = (Switch)findViewById(R.id.switch_1);
//        if(aSwitch.isChecked())
//        {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
//            String currentDateandTime = sdf.format(new Date());
//            if(currentDateandTime.equals("12:10:00"))
//            {
//                Toast.makeText(getApplicationContext(), "show ", Toast.LENGTH_SHORT).show();
//
//            }
//        }

    }

    public void mesg(View view)
    {
        new SweetAlertDialog(namazz.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want Quit App !")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Intent wazu = new Intent(getApplicationContext(), NamazQuiz.class);
                        startActivity(wazu);

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

    public void play_animation(View view)
    {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.boynimaz);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }



}