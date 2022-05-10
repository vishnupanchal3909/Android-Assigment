package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class Calculator_Activity extends AppCompatActivity {

    Button Btn0,Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Btn0=findViewById(R.id.btn0);
        Btn1=findViewById(R.id.btn1);
        Btn2=findViewById(R.id.btn2);
        Btn3=findViewById(R.id.btn3);
        Btn4=findViewById(R.id.btn4);
        Btn5=findViewById(R.id.btn5);
        Btn6=findViewById(R.id.btn6);
        Btn7=findViewById(R.id.btn7);
        Btn8=findViewById(R.id.btn8);
        Btn9=findViewById(R.id.btn9);



    }
}