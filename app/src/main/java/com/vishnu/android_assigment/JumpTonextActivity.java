package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class JumpTonextActivity extends AppCompatActivity {


    TextInputEditText Name,SurName;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_tonext);
        Name=findViewById(R.id.NameOfUser);
        SurName=findViewById(R.id.SurnameOfUser);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Name.getText().toString().isEmpty() || SurName.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Please Enter Details", Toast.LENGTH_SHORT).show();

                }
                else
                    {
                        Intent intent=new Intent(getApplicationContext(),NextActivity.class);
                        intent.putExtra("name",Name.getText().toString());
                        intent.putExtra("surname",SurName.getText().toString());
                        startActivity(intent);
                    }

            }
        });

    }
}