package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button3 = (Button) findViewById(R.id.button3Day);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v) {
                openDay3();
            }
        });

        button4 = (Button) findViewById(R.id.button4Day);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openDay4();
            }
        });

    }
    public void openDay3() {
        Intent intent = new Intent(this, Day3.class);
        startActivity(intent);
    };
    public void openDay4() {
        Intent intent = new Intent(this, Day4.class);
        startActivity(intent);
    };
}