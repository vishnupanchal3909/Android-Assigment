package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView first,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        first=findViewById(R.id.firstText);
        second=findViewById(R.id.secondText);

        String F=getIntent().getStringExtra("name");
        String S=getIntent().getStringExtra("surname");

        first.setText(F);
        second.setText(S);
    }
}