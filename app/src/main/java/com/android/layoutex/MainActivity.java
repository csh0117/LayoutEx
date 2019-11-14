package com.android.layoutex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    EditText editTo;
    EditText subject;
    EditText memo;

//    String toStr;
//    String subjectStr;
//    String memoStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        editTo = (EditText)findViewById(R.id.editTo);
        subject = (EditText)findViewById(R.id.subject);
        memo = (EditText)findViewById(R.id.memo);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String toStr = editTo.getText().toString();
                String subjectStr = subject.getText().toString();
                String memoStr = memo.getText().toString();

                if(toStr==null || toStr.equals("")){
                    Toast.makeText(getApplicationContext(),"받는이가 없습니다. 다시 입력하세요..",Toast.LENGTH_SHORT).show();
                    return;
                }


                String result = "받는이: "+toStr+"제목: "+subjectStr+"메모: "+memoStr;

                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
