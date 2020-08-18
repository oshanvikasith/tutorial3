package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    String takevalue1;
    String takevalue2;
    TextView txt1;
    TextView txt2;
    TextView dsply;

    int value1;
    int value2;

    Button addition;
    Button subtraction;
    Button multiplication;
    Button divide;
    int display;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1=findViewById(R.id.textView3);
        txt2=findViewById(R.id.textView4);
        dsply=findViewById(R.id.viewrslt);
        Intent myintent = getIntent();
        takevalue1=myintent.getStringExtra("value1");
        takevalue2=myintent.getStringExtra("value2");









    }

    protected void onResume() {

        super.onResume();
        txt1.setText(takevalue1);
        txt2.setText(takevalue2);



        value1=Integer.parseInt(txt1.getText().toString());
        value2=Integer.parseInt(txt2.getText().toString());

        addition=findViewById(R.id.addbtn);
        subtraction=findViewById(R.id.subbtn);
        multiplication=findViewById(R.id.mulbtn);
        divide=findViewById(R.id.divbtn);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int sum=value1+value2;
                    dsply.setText(String.valueOf(sum));


            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sub=value1-value2;
                dsply.setText(String.valueOf(sub));


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int div=value1/value2;
                dsply.setText(String.valueOf(div));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul=value1*value2;
                dsply.setText(String.valueOf(mul));
            }
        });




    }


}
