package com.example.islamicapp.BoyGirlPanel.girl.wazuQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.islamicapp.BoyGirlPanel.farzPakage.FarzMainActivity.FarzMaicActivity;
import com.example.islamicapp.BoyGirlPanel.girl.namazQuiz.dataSet;
import com.example.islamicapp.BoyGirlPanel.girl.namazQuiz.namazQuiz;
import com.example.islamicapp.BoyGirlPanel.girl.namazQuiz.setterGetter;
import com.example.islamicapp.R;
import com.example.islamicapp.girl_five_list.Mainactivty_girl_portion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class wazu_quiz_girl extends AppCompatActivity {
    public Button b1, b2, b3, b4;
    ImageView flg_image;
    List<wazuSetterGetter> list;
    Random r;
    int turn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wazu_quiz_girl);
        flg_image = findViewById(R.id.question_image);
        b1 = findViewById(R.id.option_one);
        b2 = findViewById(R.id.option_two);
        b3 = findViewById(R.id.option_three);
        b4 = findViewById(R.id.option_fourth);
        list = new ArrayList<>();
        r = new Random();
        for (int i = 0; i < new wazuDataBase().Ans.length; i++) {
            list.add(new wazuSetterGetter(new wazuDataBase().Ans[i], new wazuDataBase().images[i]));

        }
        Collections.shuffle(list);
        newQuestion(turn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(wazu_quiz_girl.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < 6) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(wazu_quiz_girl.this, "over", Toast.LENGTH_SHORT).show();



                    }
                }
                else
                {
                    new SweetAlertDialog(wazu_quiz_girl.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(), Mainactivty_girl_portion.class);
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
                    Toast.makeText(wazu_quiz_girl.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(wazu_quiz_girl.this, "over", Toast.LENGTH_SHORT).show();



                    }
                }
                else
                {
                    new SweetAlertDialog(wazu_quiz_girl.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again !")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(),Mainactivty_girl_portion.class);
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
                    Toast.makeText(wazu_quiz_girl.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(wazu_quiz_girl.this, "over", Toast.LENGTH_SHORT).show();



                    }
                }
                else
                {
                    new SweetAlertDialog(wazu_quiz_girl.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again !")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(),Mainactivty_girl_portion.class);
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
                    Toast.makeText(wazu_quiz_girl.this, "correct Ans", Toast.LENGTH_SHORT).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(wazu_quiz_girl.this, "over", Toast.LENGTH_SHORT).show();
                        Intent gameIntent = new Intent(getApplicationContext(), Mainactivty_girl_portion.class);
                        startActivity(gameIntent);


                    }
                }
                else
                {
                    new SweetAlertDialog(wazu_quiz_girl.this,SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("your Answer is wrong Try again !")
                            .setCancelText("Try Again !")
                            .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {

                                    Intent intent = new Intent(getApplicationContext(), Mainactivty_girl_portion.class);
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