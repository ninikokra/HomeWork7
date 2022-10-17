package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity 
// i am from browser repo
    // i am  from Android Studio
{
    EditText nameET, locationET;
    Button saveDataBtn, goDataBtn;

    String nameData,locationData;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameET = findViewById(R.id.nameET);
        locationET = findViewById(R.id.locationET);

        saveDataBtn = findViewById(R.id.saveSFButton);
        goDataBtn = findViewById(R.id.goButton);

        sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);
        editor = sharedPreferences.edit();


       saveDataBtn.setOnClickListener(v -> {
           nameData = nameET.getText().toString();
           locationData = locationET.getText().toString();
           editor.putString("namedata1", nameData);
           editor.putString("locationdata1", locationData);
           editor.commit();

           Toast.makeText(MainActivity.this, "Data Saved Successfully! ", Toast.LENGTH_SHORT).show();
       });

        goDataBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });





    }


   /* public void go(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

    }

    public void save(View view) {
        nameData = nameET.getText().toString();
        locationData = locationET.getText().toString();
        editor.putString("namedata1", nameData);
        editor.putString("locationdata1", locationData);
        editor.commit();

        Toast.makeText(this, "Data saved Successfully! ", Toast.LENGTH_SHORT).show();

    }*/
}
