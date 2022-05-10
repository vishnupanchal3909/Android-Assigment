package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBar_Activity extends AppCompatActivity {
//
    Switch S;
    TextView T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        S=findViewById(R.id.switch1);
        T=findViewById(R.id.answer);

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss;
                if(S.isChecked()){
                    Toast.makeText(getApplicationContext(), "Usb Is On", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Usb Is Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}