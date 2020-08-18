package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.intentsproj.R.*;

public class MainActivity<integer> extends AppCompatActivity {

    Button btn;

    EditText value1input;
    EditText value2input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);


    }
    protected void onResume() {

        super.onResume();
        btn=findViewById(R.id.btn1);

        value1input =(EditText) findViewById(id.num1);
        value2input=(EditText) findViewById(id.num2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);

                //get details from edit text
                String number1=value1input.getText().toString();
                String number2=value2input.getText().toString();

                intent.putExtra("value1", number1);
                intent.putExtra("value2",number2);

                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);

                toast.show();
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);

            }
        });

    }

}