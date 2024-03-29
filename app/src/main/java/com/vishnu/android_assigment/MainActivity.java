package com.vishnu.android_assigment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    Button JumpToWithText,ASMDBtn,FactorialBtn,RadioBtn,CheckBoxBtn,
            IncreaseTextBtn,LoginBtn,RatingBarBtn,CalBtn,dialogBtn,dialogBtnCust,dateBTn,
            UPRLshiftsBtn,tableBtn,TImeBtn,imageswitcherBtn,sppinerBtn,gridview;
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
        dialogBtnCust=findViewById(R.id.dialogCustom);
        UPRLshiftsBtn=findViewById(R.id.ULRLshit);
        tableBtn=findViewById(R.id.TableApp);
        dateBTn=findViewById(R.id.datecalender);
        TImeBtn =findViewById(R.id.timepick);
        imageswitcherBtn=findViewById(R.id.imagefactory);
        sppinerBtn=findViewById(R.id.spinner);
        gridview=findViewById(R.id.gridBtn);
//
//
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
        dialogBtnCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Fact_With_DialogBox.class);
                startActivity(intent);
            }
        });
        UPRLshiftsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ProgramUPRLShifts.class);
                startActivity(intent);
            }
        });
        tableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TableApp.class);
                startActivity(intent);
            }
        });
        dateBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),DateCalender.class);
                startActivity(intent);
            }
        });
        TImeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TimeSelect.class);
                startActivity(intent);
            }
        });
        imageswitcherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SwitchImage.class);
                startActivity(intent);
            }
        });

        sppinerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SpinnerActvity.class);
                startActivity(intent);
            }
        });
        gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),GridData.class);
                startActivity(intent);
            }
        });
    }
}