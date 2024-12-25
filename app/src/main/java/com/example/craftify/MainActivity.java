package com.example.craftify;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
//        Btnredirect = findViewById(R.id.btnRedirect);
        System.out.println("starting ...............");

//        Btnredirect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {

              Toast.makeText(MainActivity.this, "rah 5dam !!!!!!", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the Authentication activity
                Intent intent = new Intent(MainActivity.this, Authentication.class);
                startActivity(intent);
                // Finish MainActivity if you don't want the user to come back here
                finish();
            }
        }, 1300); // 1000 milliseconds = 1 second
//        });


    }
}