package com.example.craftify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    Button Ihaveanaccount , signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        Ihaveanaccount = findViewById(R.id.btnIhaveAcc);
        signup = findViewById(R.id.BtnSignUp);

        Ihaveanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Signup.this, "aaaa", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signup.this, Authentication.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Signup.this, "aaaaa", Toast.LENGTH_SHORT).show();

            }
        });

    }
}