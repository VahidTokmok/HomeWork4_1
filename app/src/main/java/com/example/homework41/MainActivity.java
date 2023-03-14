package com.example.homework41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    MaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editName);
        materialButton = findViewById(R.id.firstNextButton);

        materialButton.setOnClickListener(v -> {
            Intent firstIntent = new Intent(MainActivity.this, SecondActivity.class);
            firstIntent.putExtra("nameKey", editText.getText().toString());
            startActivity(firstIntent);
        });
    }
}