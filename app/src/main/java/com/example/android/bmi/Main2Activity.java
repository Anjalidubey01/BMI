package com.example.android.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private Button bb;
    private TextView te;
    private TextView ty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        bb = (Button) findViewById(R.id.button3);
        te = (TextView) findViewById(R.id.textView5);
        ty = (TextView)findViewById(R.id.textView7) ;
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double wei = Double.parseDouble(n1.getText().toString());
                double hei = Double.parseDouble(n2.getText().toString());
                double q = (wei*100*100)/(hei*hei);
                te.setText("BMI = "+Double.toString(q));
                if(q<18.5){ty.setText("Aww..underweight Range");}
                else if(q>18.5 && q<25){ty.setText("Congrats!u fall under normal Range");}
                else
                {ty.setText("OOPS...Overweight Range");}



            }
        });
    }}