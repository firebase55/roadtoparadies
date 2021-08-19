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

        return holder;
    }
}
