package com.vishnu.android_assigment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fact_With_DialogBox extends AppCompatActivity {

    EditText name;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_with_dialog_box);

        name=findViewById(R.id.name_accept_of_user);
        submit=findViewById(R.id.cal_fact);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=name.getText().toString();
                int answer=calFact(value);
                show_alertDialog_Box(answer,value);
            }
        });
    }

    private void show_alertDialog_Box(int answer,String value) {

        AlertDialog.Builder builder=new AlertDialog.Builder(Fact_With_DialogBox.this);
        builder.setTitle("Factorial");
        builder.setMessage("Factorial Of "+Integer.parseInt(value)+" is:-"+answer);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

    private int calFact(String value) {
        int I=Integer.parseInt(value);
        int fact=1;
        for(int i=I;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
}