package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.media.MediaPlayer;

import android.view.View;


public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txt = (TextView) findViewById(R.id.app);
        Button cl1 = (Button) findViewById(R.id.Red);
        Button cl2 = (Button) findViewById(R.id.Black);
        Button cl3 = (Button) findViewById(R.id.Pink);
        Button cl4 = (Button) findViewById(R.id.Purple);
        Button cl5 = (Button) findViewById(R.id.Blue);
        Button cl6 = (Button) findViewById(R.id.Green);
        Button cl7= (Button) findViewById(R.id.Yellow);
        Button cl8  = (Button) findViewById(R.id.Grey);
        Button cl9= (Button) findViewById(R.id.Brown);
        Button cl10  = (Button) findViewById(R.id.Orange);
        final MediaPlayer mp1= MediaPlayer.create(getApplicationContext(), R.raw.red);
        final MediaPlayer mp2= MediaPlayer.create(getApplicationContext(), R.raw.blue);
        final MediaPlayer mp3= MediaPlayer.create(getApplicationContext(), R.raw.green);
        final MediaPlayer mp4= MediaPlayer.create(getApplicationContext(), R.raw.purple);
        final MediaPlayer mp5= MediaPlayer.create(getApplicationContext(), R.raw.black);
        final MediaPlayer mp6= MediaPlayer.create(getApplicationContext(), R.raw.orange);
        final MediaPlayer mp7= MediaPlayer.create(getApplicationContext(), R.raw.pink);
        final MediaPlayer mp8= MediaPlayer.create(getApplicationContext(), R.raw.brown);
        final MediaPlayer mp9= MediaPlayer.create(getApplicationContext(), R.raw.yellow);
        final MediaPlayer mp10= MediaPlayer.create(getApplicationContext(), R.raw.grey);

        View.OnClickListener l = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.Orange:
                        mp6.start();
                        break;
                    case R.id.Red:
                        mp1.start();
                        break;
                    case R.id.Blue:
                        mp2.start();
                        break;
                    case R.id.Yellow:
                        mp9.start();
                        break;
                    case R.id.Pink:
                        mp7.start();
                        break;
                    case R.id.Brown:
                        mp8.start();
                        break;
                    case R.id.Grey:
                        mp10.start();
                        break;
                    case R.id.Black:
                        mp5.start();
                        break;
                    case R.id.Purple:
                        mp4.start();
                        break;
                    case R.id.Green:
                        mp3.start();
                        break;
                }
            }

    };
        cl1.setOnClickListener(l);
        cl2.setOnClickListener(l);
        cl3.setOnClickListener(l);
        cl4.setOnClickListener(l);
        cl5.setOnClickListener(l);
        cl6.setOnClickListener(l);
        cl7.setOnClickListener(l);
        cl8.setOnClickListener(l);
        cl9.setOnClickListener(l);
        cl10.setOnClickListener(l);

}}