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
                Toast.makeText(getApplicationContext(), radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}