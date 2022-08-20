package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0,btnminus,btnplus,btnmul,btndiv,btneqal,btndot,btnclear,btnback;
    TextView  text1;
    int count=0;

    float value1,value2;
    boolean bdAddition,mSubtraction,bdMultiplication,bdDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn9= findViewById(R.id.btn9);
        btn8= findViewById(R.id.btn8);
        btn7= findViewById(R.id.btn7);
        btn6= findViewById(R.id.btn6);
        btn5= findViewById(R.id.btn5);
        btn4= findViewById(R.id.btn4);
        btn3= findViewById(R.id.btn3);
        btn2= findViewById(R.id.btn2);
        btn1= findViewById(R.id.btn1);
        btn0= findViewById(R.id.btn0);
        btndot= findViewById(R.id.btndot);
        btneqal= findViewById(R.id.btneqal);
        btnplus= findViewById(R.id.btnplus);
        btnminus= findViewById(R.id.btnminus);
        btnmul= findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnclear = findViewById(R.id.btnclear);
        btnback = findViewById(R.id.btnback);

        text1 = findViewById(R.id.text1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"0");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1==null){
                    text1.setText("");
                }
                else{
                    value1 = Float.parseFloat(text1.getText()+"");
                    text1.setText(text1.getText()+"+");
                    bdAddition = true;
                    text1.setText(null);
                    count =0;
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(text1.getText()+"");
                mSubtraction=true;
                text1.setText("");
                count =0;
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(text1.getText()+"");
                bdMultiplication = true;
                text1.setText("");
                count =0;
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(text1.getText()+"");
                bdDivision = true;
                text1.setText("");
                count =0;
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(count==0)
                {
                    text1.setText(text1.getText()+".");
                    count=1;
                }
                else{
                    text1.setText(text1.getText());
                }
            }
        });
        btneqal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(!text1.equals(""))
                {
                    value2 = Float.parseFloat(text1.getText()+"");
                    if(bdAddition==true){
                        text1.setText(value1+value2+"");
                        bdAddition = false;
                    }
                    if(mSubtraction==true){
                        text1.setText(value1-value2+"");
                        mSubtraction = false;
                    }
                    if(bdMultiplication==true){
                        text1.setText(value1*value2+"");
                        bdMultiplication = false;
                    }
                    if(bdDivision==true){
                        text1.setText(value1/value2+"");
                        bdDivision = false;
                    }
                }
                else
                {
                    text1.setText("0");
                }
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = (String) text1.getText();
                if(str.length()>1){
                    str = str.substring(0,str.length()-1);
                    int x= str.length()-1;
                    if(str.charAt(x)=='.')
                    {
                        count = 0;
                    }
                    text1.setText(str);
                }
               else if(str.length()==1)
                {
                    text1.setText("");
                }

            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                count = 0;
            }
        });
    }
}