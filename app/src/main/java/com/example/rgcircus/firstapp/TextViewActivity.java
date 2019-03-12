package com.example.rgcircus.firstapp;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView Txv4, Txv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        Txv4 = (TextView)findViewById(R.id.tv_4);
        Txv5 = findViewById(R.id.tv_5);
        Txv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        Txv4.getPaint().setAntiAlias(true);
        Txv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}
