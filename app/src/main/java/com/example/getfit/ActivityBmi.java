package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ActivityBmi extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        button = findViewById(R.id.kcal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFood();
            }
        });

        button = findViewById(R.id.gym);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityGym();
            }
        });

    }

    public void openActivityFood(){
        Intent intent = new Intent(this, ActivityFood.class);
        startActivity(intent);
    }
    public void openActivityGym(){
        Intent intent = new Intent(this, ActivityGym.class);
        startActivity(intent);
    }
}
