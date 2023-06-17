package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Day3 extends AppCompatActivity {
    private Button buttonWeek1Push;
    private Button buttonWeek1Pull;
    private Button buttonWeek1Legs;
    private Button buttonWeek2Push;
    private Button buttonWeek2Pull;
    private Button buttonWeek2Legs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);

        buttonWeek1Push = (Button) findViewById(R.id.buttonWeek1Push);
        buttonWeek1Push.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWeek1Push();
            }
        });

        buttonWeek1Pull = (Button) findViewById(R.id.buttonWeek1Pull);
        buttonWeek1Pull.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWeek1Pull();
            }
        });

        buttonWeek1Legs = (Button) findViewById(R.id.buttonWeek1Legs);
        buttonWeek1Legs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWeek1Legs();
            }
        });

        buttonWeek2Push = (Button) findViewById(R.id.buttonWeek2Push);
        buttonWeek2Push.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWeek2Push();
            }
        });

        buttonWeek2Pull = (Button) findViewById(R.id.buttonWeek2Pull);
        buttonWeek2Pull.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWeek2Pull();
            }
        });

        buttonWeek2Legs = (Button) findViewById(R.id.buttonWeek2Legs);
        buttonWeek2Legs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWeek2Legs();
            }
        });

    }

    public void openWeek1Push() {
        Intent intent = new Intent(this, Day3Week1Push.class);
        startActivity(intent);
    };

    public void openWeek1Pull() {
        Intent intent = new Intent(this, Day3Week1Pull.class);
        startActivity(intent);
    };

    public void openWeek1Legs() {
        Intent intent = new Intent(this, Day3Week1Legs.class);
        startActivity(intent);
    };

    public void openWeek2Push() {
        Intent intent = new Intent(this, Day3Week2Push.class);
        startActivity(intent);
    };

    public void openWeek2Pull() {
        Intent intent = new Intent(this, Day3Week2Pull.class);
        startActivity(intent);
    };

    public void openWeek2Legs() {
        Intent intent = new Intent(this, Day3Week2Legs.class);
        startActivity(intent);
    };
}