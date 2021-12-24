package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.media.MediaPlayer;

import android.view.View;


public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.myToolBar);
        txt = (TextView) findViewById(R.id.app);
        b1 = (Button) findViewById(R.id.Red);
        b2 = (Button) findViewById(R.id.Black);
        b3 = (Button) findViewById(R.id.Pink);
        b4 = (Button) findViewById(R.id.Purple);
        b5 = (Button) findViewById(R.id.Blue);
        b6 = (Button) findViewById(R.id.Green);
        b7= (Button) findViewById(R.id.Yellow);
        b8  = (Button) findViewById(R.id.Grey);
        b9= (Button) findViewById(R.id.Brown);
        b10  = (Button) findViewById(R.id.Orange);
        
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

                if(v.getId()==R.id.Orange)
                    mp6.start();
                else if(v.getId()==R.id.Red)
                    mp1.start();
                else if(v.getId()==R.id.Blue)
                    mp2.start();
                else if(v.getId()==R.id.Yellow)
                    mp9.start();
                else if(v.getId()==R.id.Pink)
                    mp7.start();
                else if(v.getId()==R.id.Brown)
                    mp8.start();
                else if(v.getId()==R.id.Grey)
                    mp10.start();
                else if(v.getId()==R.id.Black)
                    mp5.start();
                else if(v.getId()==R.id.Purple)
                    mp4.start();
                else if(v.getId()==R.id.Green)
                    mp3.start();

            }

    };
        b1.setOnClickListener(l);
        b2.setOnClickListener(l);
        b3.setOnClickListener(l);
        b4.setOnClickListener(l);
        b5.setOnClickListener(l);
        b6.setOnClickListener(l);
        b7.setOnClickListener(l);
        b8.setOnClickListener(l);
        b9.setOnClickListener(l);
        b10.setOnClickListener(l);

}}