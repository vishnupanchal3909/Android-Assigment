package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBar_Activity extends AppCompatActivity {
//
    Switch S;
    TextView T;
    RatingBar ratingBar;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        S=findViewById(R.id.switch1);
        T=findViewById(R.id.answer);
        ratingBar=findViewById(R.id.ratingBar);
        submit=findViewById(R.id.show);

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss;
                if(S.isChecked()){
//                    Toast.makeText(getApplicationContext(), "Usb Is On", Toast.LENGTH_SHORT).show();
                    ss=S.getTextOn().toString();
                    T.setText("Usb Is:-"+ss);
                }else{
//                    Toast.makeText(getApplicationContext(), "Usb Is Off", Toast.LENGTH_SHORT).show();
                    ss=S.getTextOff().toString();
                    T.setText("Usb Is:-"+ss);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = "Rating is :" + ratingBar.getRating();
//                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
                T.setText(rating);
            }
        });
    }
}