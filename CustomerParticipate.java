package com.example.breakthedelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerParticipate extends AppCompatActivity {
    Button btnHome; //하단바의 홈 버튼
    Button btnParticipate; //하단바의 참여 버튼
    Button btnDelivery; //하단바의 배달 버튼
    Button btnMyPage; //하단바의 마이페이지 버튼
    Button btnCart; //상단바의 장바구니 버튼
    private View noParticipate; //참여방이 없을 때의 View

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        btnHome = (Button) findViewById(R.id.btnHome);
        btnParticipate = (Button) findViewById(R.id.btnParticipate);
        btnDelivery = (Button) findViewById(R.id.btnDelivery);
        btnMyPage = (Button) findViewById(R.id.btnMypage);
        btnCart = (Button) findViewById(R.id.btnCart);

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
                Intent intent = new Intent(getApplicationContext(), CustomerCart.class);
                startActivity(intent);
            }
        });

        init();
    }

    public void init(){
        noParticipate = (View) findViewById(R.id.noParticipate);
    }
}
