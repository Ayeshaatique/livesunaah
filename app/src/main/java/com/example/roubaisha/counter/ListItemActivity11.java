package com.example.roubaisha.counter;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ListItemActivity11 extends AppCompatActivity {
    Button play;
    MediaPlayer mP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_activity_11);
        getSupportActionBar().setTitle("Dua when meeting another muslim");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        play = (Button)findViewById(R.id.button_play);
      mP = MediaPlayer.create(ListItemActivity11.this,R.raw.msk);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP.isPlaying()){
                    mP.pause();
                    play.setBackgroundResource(R.drawable.play);
                }else {
                    mP.start();
                    play.setBackgroundResource(R.drawable.pause);
                }
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        //stopAndPlay();
        mP.stop();
        finish();

    }
}