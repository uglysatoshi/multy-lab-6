package com.example.multy_lab_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.first_anim);
        Animation animation2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.second_anim);
        button1.setOnClickListener(view -> button1.startAnimation(animation1));
        button2.setOnClickListener(view -> button2.startAnimation(animation2));
    }
}