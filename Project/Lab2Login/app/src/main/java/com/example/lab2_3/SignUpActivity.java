package com.example.lab2_3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText eUsername, ePassword,eConfirmPassword;
    private TextView tvSignin;
    private Button btnSignup;

    private final String REQUIRE = "Require";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);

        eUsername = findViewById(R.id.etUsername);
        ePassword = findViewById(R.id.etPassword);
        eConfirmPassword = findViewById(R.id.etConfirmPassword);
        tvSignin = findViewById(R.id.tvSignin);
        btnSignup = findViewById(R.id.btnSignup);

        tvSignin.setOnClickListener(this);
        btnSignup.setOnClickListener(this);
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

        if(TextUtils.isEmpty(eConfirmPassword.getText().toString())){
            ePassword.setError(REQUIRE);
            return false;

        }

        if(!TextUtils.equals(eConfirmPassword.getText().toString(), ePassword.getText().toString())){
            Toast.makeText(this, "Password not match", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    private void signUp(){
        if(!checkInput()){
            return;
        }
    }

    private void signInForm(){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnSignup) {
            signUp();
        } else if (id == R.id.tvSignin) {
            signInForm();
        }
    }
}
