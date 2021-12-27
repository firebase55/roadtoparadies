package com.example.islamicapp.BoyGirlPanel.Girls_portion;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.islamicapp.R;

public class zuhar_girl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zuhar_girl);
    }

    public void animation_two(View view) {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.zuhar);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}