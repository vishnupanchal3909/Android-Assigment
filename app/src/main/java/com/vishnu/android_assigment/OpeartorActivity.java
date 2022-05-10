package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OpeartorActivity extends AppCompatActivity {

    EditText one,second;
    Button Add,Sub,Mul,Div;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opeartor);
        one=findViewById(R.id.FirstEditext);
        second=findViewById(R.id.SecondEditext);
        Add=findViewById(R.id.Add);
        Sub=findViewById(R.id.Sub);
        Mul=findViewById(R.id.Mul);
        Div=findViewById(R.id.Div);
        answer=findViewById(R.id.answerOpeartor);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(one.getText().toString()) || TextUtils.isEmpty(second.getText().toString())){
                    one.setError("Please Enter Number");
                }else{
                    int c;
                    int a=Integer.parseInt(one.getText().toString());
                    int b=Integer.parseInt(second.getText().toString());
                    c=a+b;
                    answer.setText("Addition is:-"+c);
                }
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(one.getText().toString()) || TextUtils.isEmpty(second.getText().toString())){
                    one.setError("Please Enter Number");
                }else{
                    int c;
                    int a=Integer.parseInt(one.getText().toString());
                    int b=Integer.parseInt(second.getText().toString());
                    c=a-b;
                    answer.setText("Subtraction is:-"+c);
                }
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(one.getText().toString()) || TextUtils.isEmpty(second.getText().toString())){
                    one.setError("Please Enter Number");
                }else{
                    int c;
                    int a=Integer.parseInt(one.getText().toString());
                    int b=Integer.parseInt(second.getText().toString());
                    c=a*b;
                    answer.setText("Multipication is:-"+c);
                }
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(one.getText().toString()) || TextUtils.isEmpty(second.getText().toString())){
                    one.setError("Please Enter Number");
                }
                float c;
                int a=Integer.parseInt(one.getText().toString());
                int b=Integer.parseInt(second.getText().toString());

                if(b<0)
                {
                    second.setError("Please Enter number above the Zero");
                } else{
                    c=a/b;
                    answer.setText("Division is:-"+c);
                }
            }
        });
    }
}