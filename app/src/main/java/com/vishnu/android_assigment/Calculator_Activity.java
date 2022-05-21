package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator_Activity extends AppCompatActivity {

    Button Btn0,Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,clear,equal,add,sub,div,mul;
    TextView input,output;
    String num1,num2;
    int Id_Of_Opeartor=0;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
//
//        Btn0=findViewById(R.id.btn0);
//        Btn1=findViewById(R.id.btn1);
//        Btn2=findViewById(R.id.btn2);
//        Btn3=findViewById(R.id.btn3);
//        Btn4=findViewById(R.id.btn4);
//        Btn5=findViewById(R.id.btn5);
//        Btn6=findViewById(R.id.btn6);
//        Btn7=findViewById(R.id.btn7);
//        Btn8=findViewById(R.id.btn8);
//        Btn9=findViewById(R.id.btn9);
//        clear=findViewById(R.id.clear);
//        equal=findViewById(R.id.equal);
//        input=findViewById(R.id.input);
//        output=findViewById(R.id.output);
//        add=findViewById(R.id.Add);
//        sub=findViewById(R.id.SubT);
//        div=findViewById(R.id.divi);
//        mul=findViewById(R.id.Multi);
//
//
//        Btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                    input.setText(input.getText().toString()+"0");
//            }
//        });
//        Btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"1");
//            }
//        });
//        Btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"2");
//            }
//        });
//        Btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"3");
//            }
//        });
//        Btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"4");
//            }
//        });
//        Btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"5");
//            }
//        });
//        Btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"6");
//            }
//        });
//        Btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"7");
//            }
//        });
//        Btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"8");
//            }
//        });
//        Btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText(input.getText().toString()+"9");
//            }
//        });
//
//        clear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                input.setText("");
//            }
//        });
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                num1=input.getText().toString();
//                Id_Of_Opeartor=1;
//                input.setText("");
//            }
//        });
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                num1=input.getText().toString();
//                Id_Of_Opeartor=2;
//                input.setText("");
//            }
//        });
//        mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                num1=input.getText().toString();
//                Id_Of_Opeartor=3;
//                input.setText("");
//            }
//        });
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                num1=input.getText().toString();
//                Id_Of_Opeartor=4;
//                input.setText("");
//            }
//        });
//
//        equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int N1=Integer.parseInt(num1);
//                num2=input.getText().toString();
//                int N2=Integer.parseInt(num2);
//                input.setText("");
//                if(Id_Of_Opeartor==1){
//                    int c=N1+N2;
//                    output.setText(c);
//                }
//                if(Id_Of_Opeartor==2){
//                    int c=N1-N2;
//                    output.setText(c);
//                }
//                if(Id_Of_Opeartor==3){
//                    int c=N1*N2;
//                    output.setText(c);
//                }
//                if(Id_Of_Opeartor==4){
//                    float c=N1/N2;
//                    output.setText(Integer.parseInt(String.valueOf(c)));
//                }
//
//            }
//        });

    }
}