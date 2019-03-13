package com.example.rgcircus.firstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_tv;
    private Button btn_bt;
    private Button btn_et;
    private Button btn_rb;
    private Button btn_cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tv = findViewById(R.id.btn_1);
        btn_bt = findViewById(R.id.btn_2);
        btn_et = findViewById(R.id.btn_3);
        btn_rb = findViewById(R.id.btn_4);
        btn_cb = findViewById(R.id.btn_5);
        setListenner();

    }
    private void setListenner(){
        OnClick onClick = new OnClick();
        btn_rb.setOnClickListener(onClick);
        btn_tv.setOnClickListener(onClick);
        btn_et.setOnClickListener(onClick);
        btn_bt.setOnClickListener(onClick);
        btn_cb.setOnClickListener(onClick);
    }

    private class  OnClick  implements View.OnClickListener{

        public  void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_1:
                     intent = new Intent(MainActivity.this, TextView.class);
                    break;

                case R.id.btn_2:
                     intent = new Intent(MainActivity.this, Button.class);
                    break;

                case R.id.btn_3:
                     intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;

                case R.id.btn_4:
                     intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;

                case R.id.btn_5:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
            }
            startActivity(intent);

        }

    }
}
