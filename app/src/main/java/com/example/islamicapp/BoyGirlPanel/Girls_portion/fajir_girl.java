package com.example.islamicapp.BoyGirlPanel.Girls_portion;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.islamicapp.R;

public class fajir_girl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fajir_girl);
    }
    public void animation_one(View view)
    {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.fajar);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}