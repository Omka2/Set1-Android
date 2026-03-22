package com.example.set_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Name: Omurbek Uraimov
    // Student ID: 54167
    // Lab: 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnB = findViewById(R.id.btnPartB);
        Button btnC = findViewById(R.id.btnPartC);

        btnB.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, IntroduceActivity.class));
        });

        btnC.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, GuessGameActivity.class));
        });
    }
}