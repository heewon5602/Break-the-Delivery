/*Store Owner을 위한 계정 생성 UI*/
package com.example.breakthedelivery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StoreCreate extends AppCompatActivity {

    EditText storeOwner_id; //Id 입력창
    EditText storeOwner_pw; //password 입력창
    EditText storeOwner_phoneNum; //Phone number 입력창
    Button btnNext;
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_storeowner);
        context = getApplicationContext();

        storeOwner_id = findViewById(R.id.storeOwner_id); //xml에서 editView 형태 Id의 아이디도 txtId라고 가정
        storeOwner_pw = findViewById(R.id.storeOwner_pw); //xml에서 editView 형태 Password의 아이디도 txtPassword라고 가정
        storeOwner_phoneNum = findViewById(R.id.storeOwner_phoneNum); //xml에서 editView 형태 Phone의 아이디도 txtPhone라고 가정

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignIn.class);
                startActivity(intent);
                Toast.makeText(context, storeOwner_id+"님, 계정 생성이 완료되었습니다.", duration).show();
            }
        });
    }
}