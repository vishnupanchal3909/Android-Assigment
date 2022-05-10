package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FactorialActivity extends AppCompatActivity {

    EditText Input;
    Button CalFact;
    TextView Answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        Input=findViewById(R.id.inputNumber);
        CalFact=findViewById(R.id.FactorialCal);
        Answer=findViewById(R.id.AnswerFact);

        CalFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int N;
                int Fact=1;
                N=Integer.parseInt(Input.getText().toString());
                if(TextUtils.isEmpty(Input.getText().toString())){
                    Input.setError("Please Enter Number");
                }
                else{
                    for(int i=N;i>0;i--){
                        Fact=Fact*i;
                    }
                }
                Answer.setText("Factorial Of "+N+" is:-"+Fact);
            }
        });
    }
}