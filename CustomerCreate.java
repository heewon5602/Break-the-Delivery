/*Customer을 위한 계정 생성 UI*/
package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CustomerCreate extends AppCompatActivity {
    TextView labelCustomer; //customer 유형을 위한 계정생성 UI임을 나타냄
    TextView labelId; //Id 입력창 위의 문자열
    TextView labelPassword; //Password 입력창 위의 문자열
    TextView labelPhone; //phone number 입력창 위의 문자열
    EditText txtId; //Id 입력창
    EditText txtPassword; //password 입력창
    EditText txtPhone; //Phone number 입력창
    Button btnNext;
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_create);
        context = getApplicationContext();

        labelCustomer = findViewById(R.id.labelCustomer); //xml에서 textView 형태 최상단 문자열의 아이디도 labelCustomer라고 가정
        labelId = findViewById(R.id.labelId); //xml에서 textView 형태 Id의 아이디도 labelId라고 가정
        labelPassword = findViewById(R.id.labelPassword); //xml에서 textView 형태 Password의 아이디도 labelPassword라고 가정
        labelPhone = findViewById(R.id.labelPhone); //xml에서 textView 형태 Phone Number의 아이디도 labelPhone라고 가정
        txtId = findViewById(R.id.txtId); //xml에서 editView 형태 Id의 아이디도 txtId라고 가정
        txtPassword = findViewById(R.id.txtPassword); //xml에서 editView 형태 Password의 아이디도 txtPassword라고 가정
        txtPhone = findViewById(R.id.txtPhone); //xml에서 editView 형태 Phone의 아이디도 txtPhone라고 가정

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().SignIn.class);
                StartActivityForResult(intent, SignIn);
                Toast.makeText(context, txtId+"님, 계정 생성이 완료되었습니다.", duration).show();
            }
        });
    }
}