package com.example.lab2_subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView minNum;
    TextView maxNum;
    TextView displayNum;
    Button   button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References
        minNum = (TextView)findViewById(R.id.minNumber);
        maxNum = (TextView)findViewById(R.id.maxNumber);
        displayNum = (TextView)findViewById(R.id.numberResult);
        button = (Button)findViewById(R.id.button);

        // logic
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickBtn();
            }
        });


    }
    private void OnClickBtn(){
        try {
            int min = Integer.parseInt(minNum.getText().toString());
            int max = Integer.parseInt(maxNum.getText().toString());
            if (min < 0 || 0 > max ){
                displayNum.setText("Min and max must be postitive");
                return;
            }
            if (min > max ){
                displayNum.setText("Min must smaller Max number");
                return;
            }
            if (max > 100000 || min > 100000){
                displayNum.setText("Max/min must below 100000");
                return;
            }

            Integer newInt = (int)Math.floor(Math.random() * (max - min + 1) + min);
            displayNum.setText(newInt.toString());
        }catch (Exception e){
            displayNum.setText("Input number not valid!");
            return;
        }

    }
}