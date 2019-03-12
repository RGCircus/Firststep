package com.example.rgcircus.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn3;
    private TextView mtv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn3 = findViewById(R.id.btn_3);
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "btn_3我被点击了", Toast.LENGTH_SHORT).show();
            }
        });

        mtv1 = findViewById(R.id.tv_5);
        mtv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "文字被点击了", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view ){
        Toast.makeText(this, "我被点击了", Toast.LENGTH_SHORT).show();
    }

}
