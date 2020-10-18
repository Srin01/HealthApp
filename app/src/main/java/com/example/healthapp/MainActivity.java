package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewHeader;
    ImageView bmiImage;
    ImageView waterIndex;
    ImageView calorieIndex;
    ImageView distance;
    private Button loginpage;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();

        loginpage=findViewById(R.id.redirect_to_login_button);

        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);

            }
        });
    }

    private void bindViews() {
        imageViewHeader = findViewById(R.id.imageView_header);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }



}