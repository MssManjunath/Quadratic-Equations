package com.example.quad;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;
import java.lang.String;


public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button bs;
    private Button equ;
    private Button nxt;
    private Button minus;
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView res;
    private double val1;
    private double val2;
    private double val3;
    private int val4=0;
    private int min=0;
    private double val5;
    private double val6;
    private double root1, root2;
    private double d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0){
                    val1=Double.parseDouble(a.getText().toString());
                    if(min==1) {
                        val1 = 0 - val1;
                        min = 0;
                    }
                    val4=1;
                }
                else if(val4==1){
                    val2=Double.parseDouble(a.getText().toString());
                    if(min==1) {
                        val2 = 0 - val2;
                        min = 0;
                    }
                    val4=2;
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "0");
                if(val4==1)
                    b.setText(b.getText().toString() + "0");
                if(val4==2)
                    c.setText(c.getText().toString() + "0");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "-");
                if(val4==1)
                    b.setText(b.getText().toString() + "-");
                if(val4==2)
                    c.setText(c.getText().toString() + "-");
                min=1;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "1");
                if(val4==1)
                    b.setText(b.getText().toString() + "1");
                if(val4==2)
                    c.setText(c.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "2");
                if(val4==1)
                    b.setText(b.getText().toString() + "2");
                if(val4==2)
                    c.setText(c.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "3");
                if(val4==1)
                    b.setText(b.getText().toString() + "3");
                if(val4==2)
                    c.setText(c.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "4");
                if(val4==1)
                    b.setText(b.getText().toString() + "4");
                if(val4==2)
                    c.setText(c.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "5");
                if(val4==1)
                    b.setText(b.getText().toString() + "5");
                if(val4==2)
                    c.setText(c.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "6");
                if(val4==1)
                    b.setText(b.getText().toString() + "6");
                if(val4==2)
                    c.setText(c.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "7");
                if(val4==1)
                    b.setText(b.getText().toString() + "7");
                if(val4==2)
                    c.setText(c.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "8");
                if(val4==1)
                    b.setText(b.getText().toString() + "8");
                if(val4==2)
                    c.setText(c.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                    a.setText(a.getText().toString() + "9");
                if(val4==1)
                    b.setText(b.getText().toString() + "9");
                if(val4==2)
                    c.setText(c.getText().toString() + "9");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.getText().length() > 0){
                    a.setText(null);
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;

                }
                if(b.getText().length() > 0){
                    b.setText(null);
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;

                }
                if(c.getText().length() > 0){
                    c.setText(null);
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;

                }
                res.setText(null);
                val4=0;
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val4==0)
                {
                    if(a.getText().length() > 0){
                        CharSequence name = a.getText().toString();
                        a.setText(name.subSequence(0, name.length()-1));
                    }
                }
                if(val4==1)
                {
                    if(b.getText().length() > 0){
                        CharSequence name = b.getText().toString();
                        b.setText(name.subSequence(0, name.length()-1));
                    }
                }
                if(val4==2)
                {
                    if(c.getText().length() > 0){
                        CharSequence name = c.getText().toString();
                        c.setText(name.subSequence(0, name.length()-1));
                    }
                }
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              val3=Double.parseDouble(c.getText().toString());
              if(min==1)
              {
                  val3=0-val3;
                  min=0;
              }
                d = val2 * val2 - 4 * val1 * val3;
                if(d > 0) {
                    root1 = (-val2 + Math.sqrt(d)) / (2 * val1);
                    root2 = (-val2 - Math.sqrt(d)) / (2 * val1);
                    //System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
                    res.setText("root1 = "+String.valueOf(root1)+"root2="+String.valueOf(root2));
                }
                else if(d == 0) {
                    root1 = root2 = -val2 / (2 * val1);
                    res.setText("root1 = root2 = "+String.valueOf(root1));
                }
                else {
                    double realPart = -val2/ (2 *val1);
                    double imaginaryPart = Math.sqrt(-d) / (2 * val1);
                    res.setText("root1 = "+String.valueOf(realPart)+"+ i"+String.valueOf(imaginaryPart)+ "\nroot2="+String.valueOf(realPart)+"- i"+String.valueOf(imaginaryPart));
                    //System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
                }

             // val5=(-val2/2*(val2))+(Math.sqrt((val2*val2)+(4*val1*val3))/2*val2);
              //val6=(-val2/2*(val2))-(Math.sqrt((val2*val2)+(4*val1*val3))/2*val2);
              //res.setText(String.valueOf(val5)+"\n"+String.valueOf(val6));
                            }
        });

    }

    private void setupUIViews() {

        one = (Button) findViewById(R.id.btn1);
        zero = (Button) findViewById(R.id.btn0);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        clear = (Button) findViewById(R.id.btnclr);
        equ = (Button) findViewById(R.id.equ);
        bs = (Button) findViewById(R.id.btnb);
        nxt = (Button) findViewById(R.id.btnn);
        minus = (Button) findViewById(R.id.btns);
        a = (TextView) findViewById(R.id.txta);
        b = (TextView) findViewById(R.id.txtb);
        c = (TextView) findViewById(R.id.txtc);
        res = (TextView) findViewById(R.id.res);

    }
}