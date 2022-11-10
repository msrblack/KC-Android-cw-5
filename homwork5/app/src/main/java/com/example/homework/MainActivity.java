package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.exampleg.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_TEXT1 = "com.example.application.examplee.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.Name);
        EditText Age = findViewById(R.id.age);
        EditText Locion = findViewById(R.id.locion);

        Button good = findViewById(R.id.button2);
        good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

    }

    public void openActivity2() {
        EditText editText1 = (EditText) findViewById(R.id.Name);
        String text = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.age);
        int number = Integer.parseInt(editText2.getText().toString());

        EditText editText3 = (EditText) findViewById(R.id.locion);
        String text1 = editText3.getText().toString();

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER, number);
        intent.putExtra(EXTRA_TEXT1, text1);
        startActivity(intent);
    }

}