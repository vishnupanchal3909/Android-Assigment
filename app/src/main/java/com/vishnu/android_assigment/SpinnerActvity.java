package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActvity extends AppCompatActivity  {

    Spinner spinner;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_actvity);

        // Spinner element
        spinner =findViewById(R.id.listOflangage);
        answer=findViewById(R.id.answeroflist);
        String[] yognan=new String[]{
                "Select-->","Android Programming","Java","C Programming","Angular JS",
        };
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,yognan);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i)=="Android Programming"){
                    answer.setText("Android Programming");
                }
                /////////////////////
                if(adapterView.getItemAtPosition(i)=="Java"){
                    answer.setText("Java");
                }
                /////////////////////////////////
                if(adapterView.getItemAtPosition(i)=="C Programming"){
                    answer.setText("C Programming");
                }
                //////////////////////////////////
                if(adapterView.getItemAtPosition(i)=="Angular JS"){
                    answer.setText("Angular JS");
                }
            }
        });

    }
}