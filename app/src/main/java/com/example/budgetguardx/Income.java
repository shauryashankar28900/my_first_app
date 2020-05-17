package com.example.budgetguardx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Income extends AppCompatActivity {
    Button b1;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        b1=findViewById(R.id.submit);
        et1=findViewById(R.id.salary);
        et2=findViewById(R.id.savings);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1=et1.getText().toString();
                String v2=et2.getText().toString();
                Float x=Float.parseFloat(v1);
                Float y=Float.parseFloat(v2);
                Float sav= x*(y/100);
                String s=sav.toString();
                final String st="Income:"+v1+"\n Savings:"+s;
                Intent j=new Intent(Income.this,MainActivity.class);
                j.putExtra("abc",st);
                //startActivity(j);
                finish();
            }
        });

    }
}
