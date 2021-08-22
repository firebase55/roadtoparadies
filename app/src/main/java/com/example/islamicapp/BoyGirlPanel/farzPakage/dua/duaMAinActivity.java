package com.example.islamicapp.BoyGirlPanel.farzPakage.dua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.islamicapp.BoyGirlPanel.farzPakage.dua.model.Model;
import com.example.islamicapp.BoyGirlPanel.farzPakage.dua.model.myadapter.myadapter;
import com.example.islamicapp.R;

import java.util.ArrayList;

public class duaMAinActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_main);
        setTitle("List");

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(), getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue() {
        ArrayList<Model> holder = new ArrayList<>();


        Model ob1 = new Model();
        ob1.setHeader("Eating dua ");
        ob1.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob1.setImgname(R.drawable.duaa);
        ob1.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob1.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setHeader("Eating dua ");
        ob2.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob2.setImgname(R.drawable.duaa);
        ob2.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob2.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob2);
        Model ob3 = new Model();
        ob3.setHeader("Eating dua ");
        ob3.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob3.setImgname(R.drawable.duaa);
        ob3.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob3.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob3);
        Model ob4 = new Model();
        ob4.setHeader("Eating dua ");
        ob4.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob4.setImgname(R.drawable.duaa);
        ob4.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob3.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob4);
        Model ob5 = new Model();
        ob5.setHeader("Eating dua ");
        ob5.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob5.setImgname(R.drawable.duaa);
        ob5.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob5.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob5);
        Model ob6 = new Model();
        ob6.setHeader("Eating dua ");
        ob6.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob6.setImgname(R.drawable.duaa);
        ob6.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob6.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob6);
        Model ob7 = new Model();
        ob7.setHeader("Eating dua ");
        ob7.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob7.setImgname(R.drawable.duaa);
        ob7.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob7.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob7);
        Model ob8 = new Model();
        ob8.setHeader("Eating dua ");
        ob8.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob8.setImgname(R.drawable.duaa);
        ob8.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob8.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob8);
        Model ob9 = new Model();
        ob9.setHeader("Eating dua ");
        ob9.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob9.setImgname(R.drawable.duaa);
        ob9.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob9.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob9);
        Model ob10 = new Model();
        ob10.setHeader("Eating dua ");
        ob10.setDesc("بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ");
        ob10.setImgname(R.drawable.duaa);
        ob10.setTran_urdu("میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا\n" +
                "\n");
        ob10.setTran_end("In the name of Allah and with the blessings of Allah I begin (eating)\n" +
                "\n");
        holder.add(ob10);
        return holder;
    }
}
