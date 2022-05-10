package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxBtnActivity extends AppCompatActivity {

    CheckBox java,android,flutter,Net,AJS;
    TextView submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_btn);

        java=findViewById(R.id.check_first);
        android=findViewById(R.id.check_second);
        flutter=findViewById(R.id.check_third);
        Net=findViewById(R.id.check_fourth);
        AJS=findViewById(R.id.check_fifth);

        submit=findViewById(R.id.submitLanguage);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                if(java.isChecked()){
                    result.append("\nJava");
                }
                if(android.isChecked()){
                    result.append("\nandroid");
                }
                if(flutter.isChecked()){
                    result.append("\nflutter");
                }
                if (Net.isChecked()){
                    result.append("\nNet");
                }
                if(AJS.isChecked()){
                    result.append("\nAngular JS");
                }
                Toast.makeText(getApplicationContext(), "Select Language:-"+result, Toast.LENGTH_SHORT).show();
        }
        });


    }
}