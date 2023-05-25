package com.example.lab2_3;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText eUsername, ePassword;
    private TextView tvCreateOne;
    private Button btnSignIn;

    private final String REQUIRE = "Require";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUsername = findViewById(R.id.etUserName);
        ePassword = findViewById(R.id.etPassword);
        tvCreateOne = findViewById(R.id.tvCreateOne);
        btnSignIn = findViewById(R.id.btnSignIn);

        tvCreateOne.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);

    }

    private boolean checkInput(){
        if(TextUtils.isEmpty(eUsername.getText().toString())){
            eUsername.setError(REQUIRE);
            return false;

        }

        if(TextUtils.isEmpty(ePassword.getText().toString())){
            ePassword.setError(REQUIRE);
            return false;

        }

        return true;
    }

    private void signIn(){
        if(!checkInput()){
            return;
        }

        Intent intend = new Intent(this, FirstLayout.class);
        startActivity(intend);
        finish();
    }

    private void signUpForm(){
        Intent intend = new Intent(this, SignUpActivity.class);
        startActivity(intend);
        finish();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnSignIn) {
            signIn();
        } else if (id == R.id.tvCreateOne) {
            signUpForm();
        }
    }
}