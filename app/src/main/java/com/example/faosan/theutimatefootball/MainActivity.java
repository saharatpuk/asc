package com.example.faosan.theutimatefootball;



import android.os.Bundle;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

import com.example.faosan.theutimatefootball.db.Database;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = (Button)findViewById(R.id.button);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
    }
