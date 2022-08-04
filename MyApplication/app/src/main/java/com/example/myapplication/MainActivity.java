package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView1);
        TextView textView1 = findViewById(R.id.textView2);
        EditText textView2 = findViewById(R.id.planText1);
        EditText textView3 = findViewById(R.id.planText2);
        Button textView4 = findViewById(R.id.button);
    }
}