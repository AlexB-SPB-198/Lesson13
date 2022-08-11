package com.example.lesson13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    protected TextView tv_Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_Result.findViewById(R.id.tv_result);
       Intent result = getIntent();
       String text = result.getStringExtra(MainActivity.keyFor);
       tv_Result.setText(text);
    }

}