package com.example.tacolodsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        MediaPlayer intro_sound;
        intro_sound = MediaPlayer.create(SplashScreen.this,R.raw.intro_sound);
        intro_sound.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                intro_sound.stop();
                finish();
            }
        }, 7000);
    }
}