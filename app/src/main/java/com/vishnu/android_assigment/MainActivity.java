package com.vishnu.android_assigment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button JumpToWithText,ASMDBtn,FactorialBtn,RadioBtn,CheckBoxBtn,
            IncreaseTextBtn,LoginBtn,RatingBarBtn,CalBtn,dialogBtn,dialogBtnCust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JumpToWithText=findViewById(R.id.JumpToWithText);
        ASMDBtn=findViewById(R.id.ASMP);
        FactorialBtn=findViewById(R.id.Fact);
        RadioBtn=findViewById(R.id.RadioBtn);
        CheckBoxBtn=findViewById(R.id.CheckBoxBtn);
        IncreaseTextBtn=findViewById(R.id.TextIncrease);
        LoginBtn=findViewById(R.id.GoLoginPage);
        RatingBarBtn=findViewById(R.id.Rating);
        CalBtn=findViewById(R.id.Calculator);
        dialogBtn=findViewById(R.id.dialog);
        dialogBtn=findViewById(R.id.dialogCustom);


        JumpToWithText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),JumpTonextActivity.class);
                startActivity(intent);
            }
        });
        ASMDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),OpeartorActivity.class);
                startActivity(intent);
            }
        });
        FactorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),FactorialActivity.class);
                startActivity(intent);
            }
        });
        RadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),RadioBtnActivity.class);
                startActivity(intent);
            }
        });
        CheckBoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),CheckBoxBtnActivity.class);
                startActivity(intent);
            }
        });
        IncreaseTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),IncreaseActivity.class);
                startActivity(intent);

            }
        });
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Login_Activity.class);
                startActivity(intent);
            }
        });
        RatingBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),RatingBar_Activity.class);
                startActivity(intent);
            }
        });
        CalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Calculator_Activity.class);
                startActivity(intent);
            }
        });
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Error");
                builder.setMessage("You Want To Exit");
                builder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setCancelable(false);
                AlertDialog alert=builder.create();
                alert.show();
            }
        });
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Fact_With_DialogBox.class);
                startActivity(intent);
            }
        });
    }
}