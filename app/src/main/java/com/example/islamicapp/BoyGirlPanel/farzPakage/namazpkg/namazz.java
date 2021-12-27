package com.example.islamicapp.BoyGirlPanel.farzPakage.namazpkg;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.islamicapp.BoyGirlPanel.farzPakage.namazQuiz.NamazQuiz;
import com.example.islamicapp.BoyGirlPanel.splashScreen.MainActivity;
import com.example.islamicapp.R;
import com.example.islamicapp.databinding.AddTextDialogBinding;
import com.google.firebase.database.core.Context;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class namazz extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazz);
        Switch switch_one = findViewById(R.id.switch_1);
        Switch switch_two = findViewById(R.id.switch_2);
        Switch switch_three = findViewById(R.id.switch_3);
        Switch switch_four = findViewById(R.id.switch_4);
        Switch switch_five = findViewById(R.id.switch_5);
        SharedPreferences sharedPreferences = getSharedPreferences("save", MODE_PRIVATE);
        switch_one.setChecked(sharedPreferences.getBoolean("value", true));
        switch_one.setOnClickListener(view -> {
            if (switch_one.isChecked()) {
                addNotification();
                Toast.makeText(this, "Your Notification Time is Set", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("value", true);
                editor.apply();
                switch_one.setChecked(true);
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("value", false);
                editor.apply();
                switch_one.setChecked(false);

            }
        });
        SharedPreferences sharedPreferences1 = getSharedPreferences("save1", MODE_PRIVATE);
        switch_two.setChecked(sharedPreferences1.getBoolean("value1", true));
        switch_two.setOnClickListener(view -> {
            if (switch_two.isChecked()) {
                addNotification();
                Toast.makeText(this, "Your Notification Time is Set", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("save1", MODE_PRIVATE).edit();
                editor.putBoolean("value1", true);
                editor.apply();
                switch_two.setChecked(true);
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save1", MODE_PRIVATE).edit();
                editor.putBoolean("value1", false);
                editor.apply();
                switch_two.setChecked(false);

            }
        });

        SharedPreferences sharedPreferences2 = getSharedPreferences("save2", MODE_PRIVATE);
        switch_three.setChecked(sharedPreferences2.getBoolean("value2", true));
        switch_three.setOnClickListener(view -> {

            if (switch_three.isChecked()) {
                addNotification();

                Toast.makeText(this, "Your Notification Time is Set", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("save2", MODE_PRIVATE).edit();
                editor.putBoolean("value2", true);
                editor.apply();
                switch_three.setChecked(true);
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save2", MODE_PRIVATE).edit();
                editor.putBoolean("value2", false);
                editor.apply();
                switch_three.setChecked(false);

            }
        });
        SharedPreferences sharedPreferences3 = getSharedPreferences("save3", MODE_PRIVATE);
        switch_four.setChecked(sharedPreferences3.getBoolean("value3", true));
        switch_four.setOnClickListener(view -> {
            if (switch_four.isChecked()) {
                addNotification();
                Toast.makeText(this, "Your Notification Time is Set", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("save3", MODE_PRIVATE).edit();
                editor.putBoolean("value3", true);
                editor.apply();
                switch_four.setChecked(true);
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save3", MODE_PRIVATE).edit();
                editor.putBoolean("value3", false);
                editor.apply();
                switch_four.setChecked(false);
            }
        });
        SharedPreferences sharedPreferences4 = getSharedPreferences("save4", MODE_PRIVATE);
        switch_five.setChecked(sharedPreferences4.getBoolean("value4", true));
        switch_five.setOnClickListener(view -> {
            if (switch_five.isChecked()) {
                addNotification();
                Toast.makeText(this, "Your Notification Time is Set", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("save4", MODE_PRIVATE).edit();
                editor.putBoolean("value4", true);
                editor.apply();
                switch_five.setChecked(true);
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save4", MODE_PRIVATE).edit();
                editor.putBoolean("value4", false);
                editor.apply();
                switch_five.setChecked(false);

            }
        });
    }

    public void mesg(View view) {
        new SweetAlertDialog(namazz.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want Quit App !")
                .setConfirmText("Yes")
                .setConfirmClickListener(sDialog -> {

                    Intent wazu = new Intent(getApplicationContext(), NamazQuiz.class);
                    startActivity(wazu);

                })
                .setCancelText("No")
                .setCancelClickListener(sDialog -> sDialog.dismissWithAnimation())
                .show();
    }

    public void play_animation(View view) {
        VideoView videoView = findViewById(R.id.first_video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.boynimaz);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }


    public void fajar(View view) {
        Intent intent = new Intent(namazz.this, fajur.class);
        startActivity(intent);
    }

    public void zuhar(View view) {
        Intent intent = new Intent(namazz.this, zuhar.class);
        startActivity(intent);
    }

    public void asar(View view) {
        Intent intent = new Intent(namazz.this, asar.class);
        startActivity(intent);
    }

    public void magrib(View view) {
        Intent intent = new Intent(namazz.this, muqraib.class);
        startActivity(intent);
    }

    public void esha(View view) {
        Intent intent = new Intent(namazz.this, esha.class);
        startActivity(intent);
    }

    public void notification() {
        Dialog dialog = new Dialog(this);
        AddTextDialogBinding addSignDialogBinding = AddTextDialogBinding.inflate(LayoutInflater.from(this));
        dialog.setContentView(addSignDialogBinding.getRoot());
        addSignDialogBinding.cancel.setOnClickListener(view -> dialog.dismiss());
        dialog.setCancelable(false);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int widthLcl = (int) (displayMetrics.widthPixels * 0.9f);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) addSignDialogBinding.getRoot().getLayoutParams();
        params.width = widthLcl;
        params.gravity = Gravity.CENTER;
        if (!((Activity) getApplicationContext()).isFinishing())
            dialog.show();
        addSignDialogBinding.getRoot().setLayoutParams(params);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void addNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, NOTIFICATION_SERVICE)
                .setSmallIcon(R.drawable.iconapp)
                .setContentTitle("Your Time")
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText("Much longer text that cannot fit one line..."))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        Intent notificationIntent = new Intent(this, namazz.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

// notificationId is a unique int for each notification that you must define
//        notificationManager.notify(notificationId, builder.build());
        // Add as notification
//        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        manager.notify(0, builder.build());
    }
}