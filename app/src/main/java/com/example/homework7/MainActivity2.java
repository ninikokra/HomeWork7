package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView showDataTV;
    Button showDataBtn;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        showDataTV = findViewById(R.id.showDataTV);
        showDataBtn = findViewById(R.id.showDataButton);

        sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);

        showDataBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                showDataTV.setText(sharedPreferences.getString("namedata1","default") +
                        " - is From - " + (sharedPreferences.getString("locationdata1","default")));
            }
        });

    }
}