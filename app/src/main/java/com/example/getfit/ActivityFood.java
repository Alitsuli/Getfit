package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFood extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        button = findViewById(R.id.gym);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityGym();
            }
        });

        button = findViewById(R.id.bmi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBmi();
            }
        });
    }

    public void openActivityBmi(){
        Intent intent = new Intent(this, ActivityBmi.class);
        startActivity(intent);
    }
    public void openActivityGym(){
        Intent intent = new Intent(this, ActivityGym.class);
        startActivity(intent);
    }
}
