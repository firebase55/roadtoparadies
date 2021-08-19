package com.example.islamicapp.BoyGirlPanel.farzPakage.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.islamicapp.BoyGirlPanel.farzPakage.FarzMainActivity.FarzMaicActivity;
import com.example.islamicapp.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class quizActivity extends AppCompatActivity {
    public Button b1, b2, b3, b4;
    ImageView flg_image;
    List<country> list;
    Random r;
    int turn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        flg_image = findViewById(R.id.question_image);
        b1 = findViewById(R.id.option_one);
        b2 = findViewById(R.id.option_two);
        b3 = findViewById(R.id.option_three);
        b4 = findViewById(R.id.option_fourth);
        list = new ArrayList<>();
        r = new Random();
        for (int i = 0; i < new Datebase().Ans.length; i++) {
            list.add(new country(new Datebase().Ans[i], new Datebase().flags[i]));

        }
        Collections.shuffle(list);
        newQuestion(turn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(quizActivity.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < 6) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(quizActivity.this, "over", Toast.LENGTH_SHORT).show();



                    }
                }
                else
                {
                    new SweetAlertDialog(quizActivity.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(), FarzMaicActivity.class);
                                    startActivity(intent);



                                }
                            })
                            .show();
                }

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(quizActivity.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(quizActivity.this, "over", Toast.LENGTH_SHORT).show();



                    }
                }
                else
                {
                    new SweetAlertDialog(quizActivity.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again !")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(),FarzMaicActivity.class);
                                    startActivity(intent);

                                }
                            })
                            .show();

                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(quizActivity.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(quizActivity.this, "over", Toast.LENGTH_SHORT).show();



                    }
                }
                else
                {
                    new SweetAlertDialog(quizActivity.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again !")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(),FarzMaicActivity.class);
                                    startActivity(intent);

                                }
                            })
                            .show();

                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(quizActivity.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(quizActivity.this, "over", Toast.LENGTH_SHORT).show();
                        Intent gameIntent = new Intent(getApplicationContext(), FarzMaicActivity.class);
                        startActivity(gameIntent);


                    }
                }
                else
                {
                    new SweetAlertDialog(quizActivity.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again !")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(),FarzMaicActivity.class);
                                    startActivity(intent);

                                }
                            })
                            .show();

                }

            }
        });

    }
    private void newQuestion(int number) {
        flg_image.setImageResource(list.get(number - 1).getImage());
        int correct_ans = r.nextInt(4) + 1;
        int firstButton = number - 1;
        int secondButton;
        int thirdButton;
        int fourthButton;
        switch (correct_ans) {
            case 1:
                b1.setText(list.get(firstButton).getName());
                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());

                } while (fourthButton == firstButton || fourthButton == secondButton || firstButton == thirdButton);
                b2.setText(list.get(secondButton).getName());
                b3.setText(list.get(thirdButton).getName());
                b4.setText(list.get(fourthButton).getName());


                break;


            case 2:
                b2.setText(list.get(firstButton).getName());
                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());

                } while (fourthButton == firstButton || fourthButton == secondButton || firstButton == thirdButton);
                b1.setText(list.get(secondButton).getName());
                b3.setText(list.get(thirdButton).getName());
                b4.setText(list.get(fourthButton).getName());


            case 3:
                b3.setText(list.get(firstButton).getName());
                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());

                } while (fourthButton == firstButton || fourthButton == secondButton || firstButton == thirdButton);
                b2.setText(list.get(secondButton).getName());
                b3.setText(list.get(thirdButton).getName());
                b1.setText(list.get(fourthButton).getName());


            case 4:
                b4.setText(list.get(firstButton).getName());
                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());

                } while (fourthButton == firstButton || fourthButton == secondButton || firstButton == thirdButton);
                b2.setText(list.get(secondButton).getName());
                b3.setText(list.get(thirdButton).getName());
                b1.setText(list.get(fourthButton).getName());

        }
    }
    }

