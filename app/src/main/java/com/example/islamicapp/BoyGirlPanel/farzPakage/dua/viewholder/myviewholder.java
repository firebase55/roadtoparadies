package com.example.islamicapp.BoyGirlPanel.farzPakage.dua.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import java.text.CollationElementIterator;

public class myviewholder extends RecyclerView.ViewHolder
{
    public  ImageView img;
  public   TextView t1,t2,t3,t4;
    public myviewholder(@NonNull View itemView)
    {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.img1);
        t1=(TextView)itemView.findViewById(R.id.t1);
        t2=(TextView)itemView.findViewById(R.id.t2);
        t3=(TextView)itemView.findViewById(R.id.t3);
        t4=(TextView)itemView.findViewById(R.id.t4);

    }
}
