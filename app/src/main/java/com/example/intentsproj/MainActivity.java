package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        setContentView(R.layout.activity_main);
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customertoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();




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