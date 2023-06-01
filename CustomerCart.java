package com.example.breakthedelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerCart extends AppCompatActivity {
    Button btnHome; //하단바의 홈 버튼
    Button btnParticipate; //하단바의 참여 버튼
    Button btnDelivery; //하단바의 배달 버튼
    Button btnMyPage; //하단바의 마이페이지 버튼
    Button btnCart; //상단바의 장바구니 버튼

    /*담은 메뉴에 대한 parameters*/
    Button btnDelete; //메뉴 삭제 버튼
    Button btnAdd;
    Button btnMinus;
    Button btnOrder; //주문하기 버튼
    TextView txtCount; //메뉴 수량
    TextView txtMenu; //메뉴 이름
    private int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_cart);

        btnHome = (Button) findViewById(R.id.btnHome);
        btnParticipate = (Button) findViewById(R.id.btnParticipate);
        btnDelivery = (Button) findViewById(R.id.btnDelivery);
        btnMyPage = (Button) findViewById(R.id.btnMypage);
        btnCart = (Button) findViewById(R.id.btnCart);
        txtCount = findViewById(R.id.txtCount);
        txtCount.setText(count+"");
        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);
        btnOrder = findViewById(R.id.btnOrder);
        private int duration = Toast.LENGTH_SHORT;

        /*수량 증가 및 감소, 삭제 버튼들의 기능*/
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtCount.setText(count+"");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                txtCount.setText(count+"");
            }
        });

        /*btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerCart.this, Payment.class);
                startActivity(intent);
                Toast.makeText(CustomerCart.this, "결제를 진행합니다", Toast.LENGTH_SHORT).show();
            }
        });

        /*하단바 메뉴 버튼들의 기능*/
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerHome.class);
                startActivity(intent);
            }
        });

        btnParticipate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerParticipate.class);
                startActivity(intent);
            }
        });

        btnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerMyDelivery.class);
                startActivity(intent);
            }
        });

        btnMyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerMyPage.class);
                startActivity(intent);
            }
        });

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCart.setEnabled(false);
            }
        }); //같은 공간이므로 버튼 비활성화
    }
}