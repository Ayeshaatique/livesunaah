package com.example.roubaisha.counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.roubaisha.counter.Map.MapsActivity;
import com.example.roubaisha.counter.DuaActivity;
import com.example.roubaisha.counter.prayertime.PrayerTimeActivity;

public class MoreActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    private CardView calendarbtn;
    private CardView prayergbtn;
    private CardView tasbihbtn;
    private CardView nearestmosquebtn;
    private CardView prayertimebtn;
    private CardView duaenbtn;
    private CardView pendingprayerbtn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        calendarbtn=(CardView)findViewById(R.id.calendarbtn);
        calendarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendarActivity();
            }
        });
        prayergbtn=(CardView)findViewById(R.id.prayergbtn);
        prayergbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScrollableTabsActivity();
            }
        });
        tasbihbtn=(CardView)findViewById(R.id.tasbihbtn);
        pendingprayerbtn = (CardView)findViewById(R.id.pendingprayerbtn);

        tasbihbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTasbihActivity();
            }
        });
        nearestmosquebtn=(CardView)findViewById(R.id.nearestmosquebtn);
        nearestmosquebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNearestMosqueActivity();
            }
        });
        prayertimebtn=(CardView)findViewById(R.id.prayertimebtn);
        prayertimebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrayerTimeActivity();
            }
        });
        duaenbtn=(CardView)findViewById(R.id.duaenbtn);
        duaenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuaActivity();
            }
        });

        pendingprayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPendingPrayerActivity();
            }
        });

        TextView title=(TextView)findViewById(R.id.more_tv);

        /*Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);*/


        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavView_Bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent0 = new Intent(MoreActivity.this, HomeActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.ic_tasbih:
                        Intent intent1 = new Intent(MoreActivity.this, TasbihActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_more:
                        break;
                }


                return false;
            }
        });

    }

    public void openCalendarActivity(){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
    public void openScrollableTabsActivity(){
        Intent intent = new Intent(this, PrayerGuidance.class);
        startActivity(intent);
    }
    public void openTasbihActivity(){
        Intent intent = new Intent(this, TasbihActivity.class);
        startActivity(intent);
    }
    public void openNearestMosqueActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void openPrayerTimeActivity(){
        Intent intent = new Intent(this, PrayerTimeActivity.class);
        startActivity(intent);
    }
    public void openDuaActivity(){
        Intent intent = new Intent(this, DuaActivity.class);
        startActivity(intent);
    }
    public void openPendingPrayerActivity(){
        Intent intent = new Intent(this, PendingPrayerLayerActivity.class);
        startActivity(intent);
    }
}
