package com.example.roubaisha.counter;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class AfternActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);
        getSupportActionBar().setTitle("After Prayers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afa, mediaPlayer);


            }

        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afb, mediaPlayer);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afc, mediaPlayer);
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afd, mediaPlayer);
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afe, mediaPlayer);
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.aff, mediaPlayer);
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afg, mediaPlayer);
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afh, mediaPlayer);
            }
        });
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afi, mediaPlayer);
            }
        });
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.afj, mediaPlayer);

            }
        });
        Button button11=(Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button12=(Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button13=(Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button14=(Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button15=(Button)findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button16=(Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button17=(Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button18=(Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button19=(Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button20=(Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        }

    private void stopAndPlay(int rawId, MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
        AssetFileDescriptor afd = this.getResources().openRawResourceFd(rawId);
        try {
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();
    }

}

