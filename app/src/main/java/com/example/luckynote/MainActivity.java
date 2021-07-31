package com.example.luckynote;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    private LinearLayout lv_loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_loading = findViewById(R.id.lv_loading);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, home.class);
                startActivity(i);

                finish();

            }
        }, 3000);
    }
}