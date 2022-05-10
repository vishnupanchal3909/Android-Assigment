package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login_Activity extends AppCompatActivity {

    TextInputEditText username,password;
    TextView login,forget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.Username);
        password=findViewById(R.id.signUPpassword);
        login=findViewById(R.id.LoginBtn2);
        forget=findViewById(R.id.forgetPass);
//
//
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Please Enter All Details...!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Login Succefully....!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}