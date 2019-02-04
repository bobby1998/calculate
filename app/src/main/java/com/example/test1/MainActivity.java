package com.example.test1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText editText;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        bt10 = (Button)findViewById(R.id.bt10);
        bt11 = (Button)findViewById(R.id.bt11);
        bt12 = (Button)findViewById(R.id.bt12);
        bt13 = (Button)findViewById(R.id.bt13);
        bt14 = (Button)findViewById(R.id.bt14);
        bt15 = (Button)findViewById(R.id.bt15);
        bt16 = (Button)findViewById(R.id.bt16);
        bt17 = (Button)findViewById(R.id.bt17);
        bt18 = (Button)findViewById(R.id.bt18);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);
        bt17.setOnClickListener(this);
        bt18.setOnClickListener(this);
    }

    double result = 0 ;
    double num1 ;
    double num2 ;
    @Override
    public void onClick(View v){
        String text = editText.getText().toString();
        if(text.contains("÷")||text.contains("*")||text.contains("-")||text.contains("+")||text.equals("")){}
        else result = Double.parseDouble(text);
        switch (v.getId()){
            case R.id.bt1:
                text = "";
                break;
            case R.id.bt4:
                if(text.equals("")){}
                else text = text.substring(0,text.length()-1);
                break;
            case R.id.bt18:
                if(text.contains("÷")||text.contains("*")||text.contains("-")||text.contains("+")){
                    if(text.contains("÷")){
                        num1 = Double.parseDouble(text.substring(0,text.indexOf("÷")));
                        num2 = Double.parseDouble(text.substring(text.indexOf("÷")+1));
                        result = num1/num2;
                    }
                    if(text.contains("*")){
                        num1 = Double.parseDouble(text.substring(0,text.indexOf("*")));
                        num2 = Double.parseDouble(text.substring(text.indexOf("*")+1));
                        result = num1*num2;
                    }
                    if(text.contains("-")){
                        num1 = Double.parseDouble(text.substring(0,text.indexOf("-")));
                        num2 = Double.parseDouble(text.substring(text.indexOf("-")+1));
                        result = num1-num2;
                    }
                    if(text.contains("+")){
                        num1 = Double.parseDouble(text.substring(0,text.indexOf("+")));
                        num2 = Double.parseDouble(text.substring(text.indexOf("+")+1));
                        result = num1+num2;
                    }
                }
                text = ""+result ;
                break;
            default:
                Button bt = (Button)v;
                text =  text+bt.getText().toString();
                break;
        }
        editText.setText(text);
    }

}
