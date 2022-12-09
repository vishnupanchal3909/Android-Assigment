package com.vishnu.android_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridData extends AppCompatActivity {

    GridView gridView;
    int images[]={
            R.drawable.door,
            R.drawable.facebooklogo,
            R.drawable.google3
    };
    String name[]={
            "Vishnu","Facebook","Google"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_data);

        gridView=findViewById(R.id.griddata);
        GridAdapter gridAdapter=new GridAdapter(images,name,this);
        gridView.setAdapter(gridAdapter);
    }
}