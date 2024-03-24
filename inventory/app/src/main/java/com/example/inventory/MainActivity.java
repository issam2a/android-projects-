package com.example.inventory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
CalendarView CalendarView;
Calendar Calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView =findViewById(R.id.CalendarView);
        Calendar = java.util.Calendar.getInstance();

        CalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull android.widget.CalendarView view, int year, int month, int dayOfMonth) {
                Intent intent = new Intent(MainActivity.this, DataEnteringActivity.class);
// Pass any relevant data to the new activity using intent.putExtra() if needed
                startActivity(intent);
            }


            
        });
    }
}