package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberA;
    private EditText numberB;
    private Button add;
    private Button minus;
    private Button plus;
    private Button divide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find
        numberA = (EditText) findViewById(R.id.numA);
        numberB = (EditText) findViewById(R.id.numB);
        add = (Button) findViewById(R.id.buttonA);
        minus = (Button) findViewById(R.id.buttonB);
        plus = (Button) findViewById(R.id.buttonC);
        divide = (Button) findViewById(R.id.buttonD);
        result = (TextView) findViewById(R.id.Result);


        add.setOnClickListener(v -> HandleCalculate(CalculateCase.Add));
        minus.setOnClickListener(v -> HandleCalculate(CalculateCase.Minus));
        plus.setOnClickListener(v -> HandleCalculate(CalculateCase.Plus));
        divide.setOnClickListener(v -> HandleCalculate(CalculateCase.Divide));
    }

    private void HandleCalculate(CalculateCase CalCase){
        Integer numA = 0;
        Integer numB = 0;
        try {
           numA = Integer.parseInt(numberA.getText().toString());
           numB = Integer.parseInt(numberB.getText().toString());
        }catch (Exception e){
            result.setText("Invalid string input!");
            return;
        }
        if (numA > 100000d || numB > 100000d || numA < -100000d || numB < -100000d){
            result.setText("Number must in range -100000 to 100000");
            return;
        }

        double resultNumber = 0;
        switch (CalCase){
            case Add:
                resultNumber = numB + numA;
                break;
            case Minus:
                resultNumber = numA - numB;
                break;
            case Plus:
                resultNumber = numA * numB;
                break;
            case Divide:
                resultNumber = (double)numA / (double)numB;
                break;
        }
        result.setText(resultNumber + "");
    }
    private enum CalculateCase {
        Add,
        Minus,
        Plus,
        Divide
    }
}