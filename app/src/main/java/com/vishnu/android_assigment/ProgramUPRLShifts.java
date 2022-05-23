package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class ProgramUPRLShifts extends AppCompatActivity {

    TextView answer_view;
    Button Submit_answer;
    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_uprlshifts);

        input=findViewById(R.id.input_from_user);
        answer_view=findViewById(R.id.show_answer);
        Submit_answer=findViewById(R.id.UPRLAnswer);
        radioGroup=findViewById(R.id.UPRLRadioGroup);

        Submit_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultId= radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(resultId);
                switch (radioButton.getText().toString()){
                    case "Uppercase":
                        String s=input.getText().toString();
                        answer_view.setText(s.toUpperCase(Locale.ROOT));
                        break;
                    case "Lowercase":
                        String s1=input.getText().toString();
                        answer_view.setText(s1.toLowerCase(Locale.ROOT));
                        break;
                    case "Right Shifts":
                        String s3=input.getText().toString();
                        answer_view.setText(s3.substring(0,5));
                        break;
                    case "Left Shifts":
                        String s4=input.getText().toString();
                        answer_view.setText(s4.substring(s4.length()-5,s4.length()));
                        break;
                }
                Toast.makeText(getApplicationContext(), radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}