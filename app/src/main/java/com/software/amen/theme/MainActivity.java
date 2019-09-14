package com.software.amen.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sTheme.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        Button button2= findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 =findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sTheme.changeToTheme(MainActivity.this, sTheme.t1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sTheme.changeToTheme(MainActivity.this, sTheme.t2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sTheme.changeToTheme(MainActivity.this, sTheme.t3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sTheme.changeToTheme(MainActivity.this, sTheme.t4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sTheme.changeToTheme(MainActivity.this, sTheme.t5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sTheme.changeToTheme(MainActivity.this, sTheme.t6);
            }
        });
    }
}
