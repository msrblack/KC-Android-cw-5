package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);
        String text1 = intent.getStringExtra(MainActivity.EXTRA_TEXT1);

        TextView textView = (TextView) findViewById(R.id.x1);
        TextView textView2 = (TextView) findViewById(R.id.x2);
        TextView textView3 = (TextView) findViewById(R.id.x3);

        textView.setText(text);
        textView2.setText("" + number);
        textView3.setText(text1);







    }
}