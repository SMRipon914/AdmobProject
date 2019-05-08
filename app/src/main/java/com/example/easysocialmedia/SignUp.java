package com.example.easysocialmedia;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText editText1,editText2;
    Button signUpButton;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        this.setTitle("SignUp");
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        signUpButton=findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences=getSharedPreferences("Shared", Context.MODE_PRIVATE);
                editor=sharedPreferences.edit();
                editor.putString("name", editText1.getText().toString());
                editor.putString("pass",editText2.getText().toString());
                editor.commit();
                editText1.setText("");
                editText2.setText("");
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

    }
}
