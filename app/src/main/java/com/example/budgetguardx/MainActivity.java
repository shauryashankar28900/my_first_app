package com.example.budgetguardx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button inc,Trc,detTrc,allTrc,Borrow;
    TextView today,monthly,weekly,savleft,monleft,tv;
    Bundle ext;
    //Intent k=getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inc=findViewById(R.id.income);
        Trc=findViewById(R.id.MakeTr);
        detTrc=findViewById(R.id.DetTr);
        allTrc=findViewById(R.id.VeiwTr);
        Borrow=findViewById(R.id.bl);
        inc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Income.class);
                //i.putExtra("name","we are at second activity");
                startActivity(i);
            }
        });
        ext=getIntent().getExtras();
        if (ext != null) {
        Log.e("a","b");
            String in = ext.getString("abc");
            tv.setText(in);
        }
        else{
            Log.e("abc","prt");

//        if(k != null){
//            String in=k.getStringExtra("abc");
//            tv.setText(in);
        }
        Borrow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Borrow.class);
                startActivity(in);
            }
        });
        Trc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,transact.class);
                startActivity(i);
            }
        });
        detTrc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,det_transact.class);
                startActivity(i);
            }
        });
        allTrc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,all_transact.class);
                startActivity(i);
            }
        });
}}
