package com.foysaldev.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        String data =  DataPass.yourdata;

        Toast.makeText(this, ""+data, Toast.LENGTH_SHORT).show();

    }
}