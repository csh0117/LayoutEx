package com.android.layoutex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText num1,num2,result;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plusBtn,minusBtn,multyBtn,divBtn;

    String str1,str2;   //EditText에 입력된 문자열(숫자)을 저장할 임시 String 객체

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

//        1. 객체생성 후 연결
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (EditText)findViewById(R.id.resultText);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        plusBtn = (Button)findViewById(R.id.plusBtn);
        minusBtn = (Button)findViewById(R.id.minusBtn);
        multyBtn = (Button)findViewById(R.id.multyBtn);
        divBtn = (Button)findViewById(R.id.divBtn);

        Integer i1 = Integer.parseInt(str1);        //<-- 문자열을 언박싱
//        ==> int i1 = Integer.parseInt(str1);   // <--언박싱을 요로케 해도 된다. 자동으로 언박싱 됨

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();

                if (num1.isFocused() == true) {
                    if (num1.getText().toString().trim().equals("0") || num1.getText().toString().trim().equals("")) {
                        str1 = "";
                    } else {
                        str1 = num1.getText().toString().trim() + "0";
                    }
                    num1.setText(str1);
                } else if (num2.isFocused() == true) {
                    if (num2.isFocused() == true) {
                        if (num2.getText().toString().trim().equals("0") || num2.getText().toString().trim().equals("")) {
                            str2 = "";
                        } else {
                            str2 = num2.getText().toString().trim() + "0";
                        }
                        num2.setText(str2);
                    } else {
                        Toast.makeText(getApplicationContext(), "포커스가 없습니다. 다시 입력하세요.", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
                    if (num1.isFocused() == true) {
                        str1 = num1.getText().toString().trim() + "1";
                        num1.setText(str1);
                    } else if (num2.isFocused() == true) {
                        str2 = num2.getText().toString().trim() + "0";
                        num2.setText(str2);
                    } else {
                        Toast.makeText(getApplicationContext(), "포커스가 없습니다. 다시 입력하세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }
}
