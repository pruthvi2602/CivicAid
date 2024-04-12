package com.example.scheme_01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.scheme_01.databinding.FragmentHomeBinding;
import com.example.scheme_01.ui.home.HomeFragment;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent (splash_screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
