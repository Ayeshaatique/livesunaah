package com.example.roubaisha.counter;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class MorningActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        getSupportActionBar().setTitle("Morning Remembrance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moa, mediaPlayer);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mob, mediaPlayer);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moc, mediaPlayer);
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mod, mediaPlayer);
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moe, mediaPlayer);
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mof, mediaPlayer);
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mog, mediaPlayer);
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moh, mediaPlayer);
            }
        });
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moi, mediaPlayer);
            }
        });
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moj, mediaPlayer);
            }
        });
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mok, mediaPlayer);
            }
        });
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mol, mediaPlayer);
            }
        });
        Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mom, mediaPlayer);
            }
        });
        Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mon, mediaPlayer);
            }
        });
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moo, mediaPlayer);
            }
        });
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mop, mediaPlayer);
            }
        });
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moq, mediaPlayer);
            }
        });
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mor, mediaPlayer);
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
        Button button21=(Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button22=(Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button23=(Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button24=(Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button25=(Button)findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button26=(Button)findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button27=(Button)findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button28=(Button)findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button29=(Button)findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button30=(Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button31=(Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button32=(Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button33=(Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }

        });
        Button button34=(Button)findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }


        });
        Button button35=(Button)findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                mediaPlayer.pause();



            }


        });
        Button button36=(Button)findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {

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

