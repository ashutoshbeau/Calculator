package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, be, bc;
    ImageButton bp, bm, bx, bd;
    String s1="", s2="", scr="", ans="";
    int op;
    double sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        bc=(Button)findViewById(R.id.button10);
        b0=(Button)findViewById(R.id.button11);
        be=(Button)findViewById(R.id.button12);
        bp=(ImageButton)findViewById(R.id.imageButton3);
        bm=(ImageButton)findViewById(R.id.imageButton4);
        bd=(ImageButton)findViewById(R.id.imageButton6);
        bx=(ImageButton)findViewById(R.id.imageButton7);
        tv=(TextView)findViewById(R.id.textView);
    }
    public void add(View v){
        if(s1=="") {
            s1 = tv.getText().toString();
        }
        else
            s1=ans;
        scr="";

        op=1;
    }
    public void subtract(View v){
        if(s1=="")
            s1=tv.getText().toString();
        else
            s1=ans;
        scr="";
        op=2;
    }
    public void multiply(View v){
        if(s1=="")
            s1=tv.getText().toString();
        else
            s1=ans;
        scr="";
        op=3;
    }
    public void divide(View v){
        if(s1=="")
            s1=tv.getText().toString();
        else
            s1=ans;
        scr="";
       op=4;
    }
    public void zero(View v){
        if(scr.length()<8) {
            scr += 0;
            tv.setText(scr);
        }

    }
    public void one(View v){
        if(scr.length()<8) {
            scr =scr + 1;
            tv.setText(scr);
        }
    }
    public void two(View v){
        if(scr.length()<8) {
            scr += 2;
            tv.setText(scr);
        }

    }
    public void three(View v){
        if(scr.length()<8) {
            scr += 3;
            tv.setText(scr);
        }

    }
    public void four(View v){
        if(scr.length()<8) {
            scr += 4;
            tv.setText(scr);
        }

    }
    public void five(View v){
        if(scr.length()<8) {
            scr += 5;
            tv.setText(scr);
        }

    }
    public void six(View v){
        if(scr.length()<8) {
            scr += 6;
            tv.setText(scr);
        }
    }
    public void seven(View v){
        if(scr.length()<8) {
            scr += 7;
            tv.setText(scr);
        }
    }
    public void eight(View v){
        if(scr.length()<8) {
            scr += 8;
            tv.setText(scr);
        }
    }
    public void nine(View v){
        if(scr.length()<8) {
            scr += 9;
            tv.setText(scr);
        }
    }

    public void equal(View v){
        s2=tv.getText().toString();
        if(s1!="" && s2!=""){
            if(op==1)
                sum=(double)(Double.parseDouble(s1)+Double.parseDouble(s2));
            else if(op==2)
                sum=(double)(Double.parseDouble(s1)-Double.parseDouble(s2));
            else if(op==3)
                sum=(double)(Double.parseDouble(s1)*Double.parseDouble(s2));
            else if(op==4)
                sum=(double)(Double.parseDouble(s1)/Double.parseDouble(s2));
        }
        ans=""+sum;
        tv.setText(ans);
        s1="";
        s2="";
        scr="";
    }
    public void clear(View v){
        scr="";
        s1="";
        s2="";
        tv.setText(scr);
    }
}
