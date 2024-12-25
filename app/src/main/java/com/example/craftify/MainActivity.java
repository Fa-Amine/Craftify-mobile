package com.example.craftify;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isSignedIn = false;
    private boolean isRegistered = false;
    Button Btnredirect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Btnredirect = findViewById(R.id.btnRedirect);
        System.out.println("starting ...............");

//        Btnredirect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "rah 5dam", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Authentication.class);
                startActivity(intent);
//            }
//        });


    }
}