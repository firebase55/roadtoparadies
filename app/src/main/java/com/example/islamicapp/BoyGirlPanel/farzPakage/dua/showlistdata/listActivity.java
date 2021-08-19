package com.example.islamicapp.BoyGirlPanel.farzPakage.dua.showlistdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.islamicapp.R;

public class listActivity extends AppCompatActivity {
    ImageView img;
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        img=(ImageView)findViewById(R.id.desc_img);
        tv1=(TextView)findViewById(R.id.desc_header);
        tv2=(TextView)findViewById(R.id.desc_desc);
        tv3=(TextView)findViewById(R.id.urdu);
        tv4=(TextView)findViewById(R.id.eng);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
        tv3.setText(getIntent().getStringExtra("urdu"));
        tv4.setText(getIntent().getStringExtra("eng"));

    }
}