package com.example.celltron.bookapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button neural;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        neural = (Button) findViewById(R.id.btn1);
        neural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Neuralnet.class);
                startActivity(i);


            }


        });

        Button Artifi;


        Artifi = (Button) findViewById(R.id.btn2);
        Artifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Artificaial.class);
                startActivity(i);


            }


        });


        Button Cloud;


        Cloud = (Button) findViewById(R.id.btn3);
        Cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Cloudcom.class);
                startActivity(i);


            }


        });



        Button Mobile;


        Mobile = (Button) findViewById(R.id.btn4);
        Mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Mobileapp.class);
                startActivity(i);


            }


        });



        Button Wireless;


        Wireless = (Button) findViewById(R.id.btn5);
        Wireless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Wireless.class);
                startActivity(i);


            }


        });









}
        }


