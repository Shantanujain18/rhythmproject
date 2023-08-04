package com.rhythm.rhythmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rhythm.rhythmlibraryai.DataDisplay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataDisplay.displayData(this,"Hello",500);
    }
}