package com.example.gykprojedemo;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button btnderslerim, btnsinavlarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        btnderslerim = findViewById(R.id.buttonDerslerim);
        btnsinavlarim = findViewById(R.id.buttonSinavlarim);

        btnsinavlarim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnderslerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent
            }
        });
    }
}
