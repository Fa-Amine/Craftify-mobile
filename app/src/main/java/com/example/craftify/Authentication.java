package com.example.craftify;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Authentication extends AppCompatActivity {


    //ImageView img1 = findViewById(R.id.ImgIcon1);
    //ImageView img2 = findViewById(R.id.ImgIcon2);
    Button createAcc, login;
    String url = ""; //DIR L3IBAT
    EditText etEmail, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_authentication);

        createAcc = findViewById(R.id.BtnCreateAcc);
        login = findViewById(R.id.btnLogin);
        etEmail = findViewById(R.id.PtEmailInput);
        etPassword = findViewById(R.id.editTextText2);

        createAcc.setOnClickListener(view -> {
            System.out.println("aaaa");
            Intent intent = new Intent(Authentication.this, Signup.class);
            startActivity(intent);
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Authentication.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                } else {
                    sendLoginRequest(url, email, password);
                }

            }
        });
    }
        private void sendLoginRequest(String url, String email, String password) {
            RequestQueue requestQueue = Volley.newRequestQueue(this);

            JSONObject requestBody = new JSONObject();
            try {
                requestBody.put("email", email);
                requestBody.put("password", password);
            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(Authentication.this, "Error creating JSON payload", Toast.LENGTH_SHORT).show();
                return;
            }

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                    Request.Method.POST,
                    url,
                    requestBody,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            Toast.makeText(Authentication.this, "Login Success: " + response.toString(), Toast.LENGTH_LONG).show();

                            Intent intent = new Intent(Authentication.this, Authentication.class); //khawa bdl hna layr7m ymak
                            startActivity(intent);
                            finish();
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(Authentication.this, "Login Failed: " + error.getMessage(), Toast.LENGTH_LONG).show();
                            Log.e("VolleyError", error.toString());
                        }
                    }
            );

            requestQueue.add(jsonObjectRequest);
        }
    }
