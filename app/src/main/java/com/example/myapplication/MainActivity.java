package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText cityName;
    private Button goButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityName = findViewById(R.id.city_name);
        goButton = findViewById(R.id.go_button);
        result = findViewById(R.id.result);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cityName.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter city name plz", Toast.LENGTH_SHORT).show();
                }
                else {
                    String city = cityName.getText().toString();
                    String api_key = "7ae68bad75f754debe622040fe78a771";
                    String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city+ "&appid=" + api_key + "&units=metric&lang=ru";
                }
            }
        });
    }
}