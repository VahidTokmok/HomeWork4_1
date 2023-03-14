package com.example.homework41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    TextView nameView, surnameView, ageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        nameView = findViewById(R.id.resultName);
        surnameView = findViewById(R.id.resultSurname);
        ageView = findViewById(R.id.resultAge);

        nameView.setText(getIntent().getStringExtra("nameKey2"));
        surnameView.setText(getIntent().getStringExtra("surnameKey1"));
        ageView.setText(getIntent().getStringExtra("ageKey"));
    }
}