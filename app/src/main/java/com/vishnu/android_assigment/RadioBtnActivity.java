package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioBtnActivity extends AppCompatActivity {

    RadioGroup Rg;
    RadioButton F,S,T;
    Button Done;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn);
        Done=findViewById(R.id.AnswerRadioBtn);
        answer=findViewById(R.id.answerRadio);
        Rg=findViewById(R.id.RadioGroup);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId=Rg.getCheckedRadioButtonId();
                F=findViewById(radioId);
                answer.setText("You Selected "+F.getText().toString());
            }
        });

    }

    public void Function(View view) {
        int radioId=Rg.getCheckedRadioButtonId();
        F=findViewById(radioId);
        Toast.makeText(getApplicationContext(), F.getText().toString(), Toast.LENGTH_SHORT).show();

    }
}