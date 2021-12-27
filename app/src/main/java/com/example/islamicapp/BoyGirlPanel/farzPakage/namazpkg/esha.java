package com.example.islamicapp.BoyGirlPanel.farzPakage.namazpkg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.islamicapp.R;

public class esha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esha);
    }

    public void animation_five(View view) {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.boy4);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}