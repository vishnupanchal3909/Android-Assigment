package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableApp extends AppCompatActivity {

    EditText number;
    Button submit;
    TextView answer;
    int ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_app);

        number=findViewById(R.id.numberInput);
        submit=findViewById(R.id.tableoutput);
        answer=findViewById(R.id.output);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(TextUtils.isEmpty(number.getText().toString())){
                        number.setError("please Enter Number");
                    }else{
                        StringBuffer buffer = new StringBuffer();
                        int res;

                        // get the input number from editText
                        String fs = number.getText().toString();

                        // convert it to integer
                        int n = Integer.parseInt(fs);

                        // build the logic for table
                        for (int i = 1; i <= 10; i++) {
                            ans = (i * n);
                            buffer.append(n + " X " + i
                                    + " = " + ans + "\n\n");
                        }

                        // set the buffer textview
                        answer.setText(buffer);
                    }
            }
        });

    }
}