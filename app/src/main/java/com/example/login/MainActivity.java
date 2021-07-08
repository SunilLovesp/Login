package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        b1 =findViewById(R.id.SignUp);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "User registered ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}