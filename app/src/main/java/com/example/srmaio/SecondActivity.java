package com.example.srmaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button CLEANLINESS;
    private Button LOSTANDFOUND;
    private Button EVENT;
    private Button FOOD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        CLEANLINESS = (Button) findViewById(R.id.button4);
        CLEANLINESS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SecondActivity.this,Cleanliness.class);
                startActivity(intent);
            }


        });
        LOSTANDFOUND = (Button) findViewById(R.id.button3);
        LOSTANDFOUND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SecondActivity.this,LOSTANDFOUND.class);
                startActivity(intent);
            }


        });
        EVENT = (Button) findViewById(R.id.button);
        EVENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SecondActivity.this,EVENT.class);
                startActivity(intent);
            }


        });
        EVENT = (Button) findViewById(R.id.b1);
        EVENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SecondActivity.this,FOOD.class);
                startActivity(intent);
            }


        });

    }



}


