package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IncreaseActivity extends AppCompatActivity {

    private float ourFontsize = 14f;
    Button increase,Decrease;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase);

        increase=findViewById(R.id.increase);
        Decrease=findViewById(R.id.Decrease);
        answer=findViewById(R.id.textV2);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ourFontsize += 4f;
                answer.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            }
        });

        Decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ourFontsize -= 4f;
                answer.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            }
        });
    }
}