package com.example.assignment_4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button buttonGet, buttonClear;
    TextView CurrentDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CurrentDate = (TextView) findViewById(R.id.currentDate);
        buttonGet = (Button)findViewById(R.id.getDate);
        buttonClear = (Button)findViewById(R.id.clearDate);

        buttonGet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
                String format = s.format(new Date());
                CurrentDate.setText(format);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CurrentDate.setText("");
            }
        });
    }

}
