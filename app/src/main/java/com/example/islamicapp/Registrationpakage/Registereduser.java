package com.example.islamicapp.Registrationpakage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.islamicapp.BoyGirlPanel.farzPakage.quiz.quizActivity;
import com.example.islamicapp.BoyGirlPanel.farzPakage.wazu.wazuActivity;
import com.example.islamicapp.R;
import com.example.islamicapp.Registrationpakage.model.data;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Registereduser extends AppCompatActivity {
    private TextView Login_page;
    private TextView login;
    private EditText name, adress, email, pass;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registereduser);
        Login_page = (TextView) findViewById(R.id.login_pagee);
        name = (EditText) findViewById(R.id.name);
        adress = (EditText) findViewById(R.id.adress);
        email = (EditText) findViewById(R.id.emai);
        pass = (EditText) findViewById(R.id.pass);
        login = (TextView) findViewById(R.id.login_page);
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();

        loginPage();//function Calling
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name_field = name.getText().toString().trim();
                String pass_field = pass.getText().toString().trim();
                String adress_field = adress.getText().toString().trim();
                String email_field = email.getText().toString().trim();
                if (name_field.isEmpty() || pass_field.isEmpty() || adress_field.isEmpty() || email_field.isEmpty()) {
                    new SweetAlertDialog(Registereduser.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Please fill Your data")
                            .setConfirmText("Ok")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    sDialog.dismissWithAnimation();


                                }
                            }).show();
                } else {
                    mAuth.createUserWithEmailAndPassword(email_field, pass_field).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {

                                Toast.makeText(getApplicationContext(), "You can Login ", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                                startActivity(intent);
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    });
                }
                saveData();
            }
        });

    }

    public void loginPage() {
        Login_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoignIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(LoignIntent);
            }
        });
    }

    public void saveData() {
        String name_field = name.getText().toString().trim();
        String adress_field = adress.getText().toString().trim();
        String email_field = email.getText().toString().trim();
        String pass_field = pass.getText().toString().trim();
        data data = new data(name_field, adress_field, email_field, pass_field);
        FirebaseDatabase fb = FirebaseDatabase.getInstance();
        DatabaseReference db = fb.getReference();
        db.child(name_field).setValue(data);
       name.setText("");
       adress.setText("");
       email.setText("");
       pass.setText("");


    }

    @Override
    public void onBackPressed() {
        new SweetAlertDialog(Registereduser.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want Quit App !")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                       finish();

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