/*Application의 첫 화면(로그인, 회원가입 선택)*/

package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtBTD; //BreakTheDelivery라는 어플 이름
    Button btnSignIn; //SignIn UI로 넘어가는 버튼
    Button btnCreate; //TypeSelection UI로 넘어가 type선택을 도와줌 (계정생성 버튼)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtBTD = (TextView)findViewById(R.id.txtBTD);
        btnSignIn = findViewById(R.id.signIn); //SignIn UI로 향하는 button 'signIn'의 id 가져옴
        btnCreate = findViewById(R.id.create); //TypeSelection으로 향하는 button 'create'의 id 가져옴

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().SignIn.class);
                StartActivityForResult(intent, SignIn);
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().TypeSelection.class);
                StartActivityForResult(intent, TypeSelection);
            }
        });
    }
}