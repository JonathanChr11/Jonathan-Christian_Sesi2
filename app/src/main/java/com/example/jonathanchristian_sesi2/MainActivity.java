package com.example.jonathanchristian_sesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btn_login);

        btnClick.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Berhasil Login!", Toast.LENGTH_SHORT).show();
        });
    }
}