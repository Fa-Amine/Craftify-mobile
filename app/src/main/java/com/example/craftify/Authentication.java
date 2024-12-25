package com.example.craftify;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Authentication extends AppCompatActivity {


    //ImageView img1 = findViewById(R.id.ImgIcon1);
    //ImageView img2 = findViewById(R.id.ImgIcon2);
    Button createAcc, login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_authentication);

        createAcc = findViewById(R.id.BtnCreateAcc);
        login = findViewById(R.id.btnLogin);

        createAcc.setOnClickListener(view -> {
            System.out.println("aaaa");
            Intent intent = new Intent(Authentication.this, Signup.class);
            startActivity(intent);
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("aaaa");
                Log.d("SignUpButton", "Clicked");
                Toast.makeText(Authentication.this, "Login Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}