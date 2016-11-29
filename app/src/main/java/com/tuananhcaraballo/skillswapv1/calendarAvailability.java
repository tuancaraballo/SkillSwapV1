package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class calendarAvailability extends AppCompatActivity {


    CalendarView calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_availability);

        calendar = (CalendarView) findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth){
                Toast.makeText(getApplicationContext(), dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_LONG);
            }
        });
    }

    //-----> Classes used to navigate between activities, not the most clean way, but it works
    public void toNetwork(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void toNotifications(View view) {
        Intent intent = new Intent(this, notifications.class);
        startActivity(intent);
    }

    public void toSearch(View view) {
        Intent intent = new Intent(this, search.class);
        startActivity(intent);
    }

    public void toMessages(View view) {
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }
}
