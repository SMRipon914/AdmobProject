package com.example.easysocialmedia;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button signinId;
    EditText name_signIn, pass_signIn;
    TextView SignupTextButton;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Login");
        setContentView(R.layout.activity_main);
        signinId = findViewById(R.id.signinId);
        name_signIn = findViewById(R.id.name_signIn);
        pass_signIn = findViewById(R.id.pass_signIn);
        SignupTextButton = findViewById(R.id.signUpText);

        SignupTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUp.class));
            }
        });

            signinId.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sharedPreferences=getSharedPreferences("Shared", Context.MODE_PRIVATE);
                    String s1=sharedPreferences.getString("name","no found");
                    String s2=sharedPreferences.getString("pass","no found");
                    if (s1.equals(name_signIn.getText().toString()) && s2.equals(pass_signIn.getText().toString())) {
                        startActivity(new Intent(getApplicationContext(), DisplayActivity.class));
                    } else {
                        name_signIn.setError("Invalid user Name or Password");
                        name_signIn.requestFocus();
                    }

                }
            });


    }

}

