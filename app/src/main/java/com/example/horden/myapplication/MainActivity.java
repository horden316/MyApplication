package com.example.horden.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.widget.Toast;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.view.Gravity;


import static com.example.horden.myapplication.R.styleable.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , p2.class);
        startActivity(intent);

        Context context = getApplication();
        CharSequence text = "Toast test~";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
