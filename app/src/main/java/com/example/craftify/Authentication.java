package com.example.craftify;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Authentication extends AppCompatActivity {


    //ImageView img1 = findViewById(R.id.ImgIcon1);
    //ImageView img2 = findViewById(R.id.ImgIcon2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_authentication);

//        Glide.with(this).load(R.drawable.origami).into(img1); // Target ImageView
//        Glide.with(this).load(R.drawable.scissor).into(img2); // Target ImageView


    }
}