package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;


public class Day4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//    public String Day4Monthly;// = R.array.Monthly_Wave;
//    public String Day4Weekly;
//    public String Day4Exercise;
        private TextView benchPress, backSquat, shoulderPress, deadLift;
        private float benchPressMax, backSquatMax, shoulderPressMax, deadLiftMax;

        private Button benchButton;
        private Button squatButton;
        private Button shoulderButton;
        private Button deadliftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);

        benchPress = (TextView) findViewById(R.id.benchPressNum);
        String benchPressString = benchPress.getText().toString();
        benchPressMax = Float.parseFloat(benchPressString);

        backSquat = (TextView) findViewById(R.id.backSquatNum);
        String backSquatString = backSquat.getText().toString();
        backSquatMax = Float.parseFloat(backSquatString);

        shoulderPress = (TextView) findViewById(R.id.shoulderPressNum);
        String shoulderPressString = shoulderPress.getText().toString();
        shoulderPressMax = Float.parseFloat(shoulderPressString);

        deadLift = (TextView) findViewById(R.id.deadLiftNum);
        String deadLiftString = deadLift.getText().toString();
        deadLiftMax = Float.parseFloat(deadLiftString);

        benchButton = (Button) findViewById(R.id.benchButton);
        benchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBench();
            }
        });

        squatButton = (Button) findViewById(R.id.squatButton);
        squatButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSquat();
            }
        });

        shoulderButton = (Button) findViewById(R.id.shoulderButton);
        shoulderButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openShoulder();
            }
        });

        deadliftButton = (Button) findViewById(R.id.deadliftButton);
        deadliftButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openDeadlift();
            }
        });

//        Spinner spinnerMonthly = findViewById(R.id.spinner_monthly);
//        ArrayAdapter<CharSequence> adapterMonthly = ArrayAdapter.createFromResource(this, R.array.Monthly_Wave, android.R.layout.simple_spinner_item);
//        adapterMonthly.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerMonthly.setAdapter(adapterMonthly);
//        spinnerMonthly = (Spinner) findViewById((R))
//        spinnerMonthly.setOnItemSelectedListener(this);
//
//
//        Spinner spinnerWeekly = findViewById(R.id.spinner_weekly);
//        ArrayAdapter<CharSequence> adapterWeekly = ArrayAdapter.createFromResource(this, R.array.Weekly_Phase, android.R.layout.simple_spinner_item);
//        adapterWeekly.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerWeekly.setAdapter(adapterWeekly);
//        spinnerWeekly.setOnItemSelectedListener(this);
//
//        Spinner spinnerExercise = findViewById(R.id.spinner_exercise);
//        ArrayAdapter<CharSequence> adapterExercise = ArrayAdapter.createFromResource(this, R.array.Main_Exercise, android.R.layout.simple_spinner_item);
//        adapterExercise.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerExercise.setAdapter(adapterExercise);
//        spinnerExercise.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        String text = parent.getItemAtPosition(position).toString();
////        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
//        switch(parent.getId())
//        {
//            case R.id.spinnerMonthly
//        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
//
    public void openBench() {
        Intent intent = new Intent(this, Day4Bench.class);
        startActivity(intent);
    };
    public void openSquat() {
        Intent intent = new Intent(this, Day4Squat.class);
        startActivity(intent);
    };
    public void openShoulder() {
        Intent intent = new Intent(this, Day4Shoulder.class);
        startActivity(intent);
    };
    public void openDeadlift() {
        Intent intent = new Intent(this, Day4Deadlift.class);
        startActivity(intent);
    };

}