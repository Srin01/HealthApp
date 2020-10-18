package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewHeader;
    ImageView bmiImage;
    ImageView waterIndex;
    ImageView calorieIndex;
    ImageView distance;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews() {
        imageViewHeader = findViewById(R.id.imageView_header);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }
}