package com.example.homework41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class ThirdActivity extends AppCompatActivity {

    TextView name, surname;
    EditText editText;
    MaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        editText = findViewById(R.id.editAge);
        materialButton = findViewById(R.id.thirdNextButton);
        name = findViewById(R.id.nameView1);
        surname = findViewById(R.id.surnameView);

        name.setText(getIntent().getStringExtra("nameKey1"));
        surname.setText(getIntent().getStringExtra("surnameKey"));

        materialButton.setOnClickListener(v -> {
            Intent thirdIntent = new Intent(ThirdActivity.this, LastActivity.class);
            thirdIntent.putExtra("nameKey2", name.getText().toString());
            thirdIntent.putExtra("surnameKey1", surname.getText().toString());
            thirdIntent.putExtra("ageKey", editText.getText().toString());
            startActivity(thirdIntent);
        });
    }
}