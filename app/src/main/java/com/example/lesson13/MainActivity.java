package com.example.lesson13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button btnClick;
    public static String keyFor = "keyword";
    protected EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = findViewById(R.id.btn_click);
        editText = findViewById(R.id.text);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(keyFor, result);
                startActivity(intent);
                /* Uri uri = Uri.parse("https://yandex.ru/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                */

            }
        });
    }
}