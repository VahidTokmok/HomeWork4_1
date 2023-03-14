package com.example.homework41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    MaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editSurname);
        materialButton = findViewById(R.id.secondNextButton);
        textView = findViewById(R.id.nameView);

        textView.setText(getIntent().getStringExtra("nameKey"));

        materialButton.setOnClickListener(v -> {
            Intent secondIntent = new Intent(SecondActivity.this, ThirdActivity.class);
            secondIntent.putExtra("nameKey1", textView.getText().toString());
            secondIntent.putExtra("surnameKey", editText.getText().toString());
            startActivity(secondIntent);
        });
    }
}