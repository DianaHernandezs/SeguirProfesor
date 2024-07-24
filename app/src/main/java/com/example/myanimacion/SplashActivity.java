package com.example.myanimacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        class splashActivity extends AppCompatActivity {

            private static final int SPLASH_TIME_OUT = 3000;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                EdgeToEdge.enable(this);
                setContentView(R.layout.activity_splash);

                ImageView logo = findViewById(R.id.fondo);
                Animation fadeIn = new AlphaAnimation(0, 1);
                fadeIn.setDuration(2000);
                logo.startAnimation(fadeIn);

                logo.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(splashActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, SPLASH_TIME_OUT);
            }
        }
    }
}