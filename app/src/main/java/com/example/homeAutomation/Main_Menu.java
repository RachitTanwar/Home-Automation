package com.example.homeAutomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button button1 = (Button) findViewById(R.id.Button1);
        Button button2 = (Button) findViewById(R.id.Button2);
    }

    public void Button1(View view) {
        Intent intent1 = new Intent(this, light.class);
        startActivity(intent1);
    }

    public void Button2(View view) {
        Intent intent = new Intent(this, fan.class);
        startActivity(intent);}

}