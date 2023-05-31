/*Delivery Man을 위한 계정 생성 UI*/
package com.example.breakthedelivery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class DeliveryCreate extends AppCompatActivity {
    EditText deliveryMan_id; //Id 입력창
    EditText deliveryMan_pw; //password 입력창
    EditText deliveryMan_phoneMum; //Phone number 입력창
    Button button_next;
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_deliveryman);
        context = getApplicationContext();

        deliveryMan_id = findViewById(R.id.deliverMan_id); //xml에서 editView 형태 Id의 아이디도 txtId라고 가정
        deliveryMan_pw = findViewById(R.id.deliverMan_pw); //xml에서 editView 형태 Password의 아이디도 txtPassword라고 가정
        deliveryMan_phoneMum = findViewById(R.id.deliverMan_phoneNum); //xml에서 editView 형태 Phone의 아이디도 txtPhone라고 가정

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignIn.class);
                startActivity(intent);
                Toast.makeText(context, deliveryMan_id+"님, 계정 생성이 완료되었습니다.", duration).show();
            }
        });
    }
}