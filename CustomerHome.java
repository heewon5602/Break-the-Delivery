package com.example.breakthedelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class CustomerHome extends AppCompatActivity {
    ImageButton store1; //store1 버튼
    ImageButton store2; //store2 버튼
    ImageButton store3; //store3 버튼
    ImageButton store4; //store4 버튼
    ImageButton home_button; //하단바의 홈 버튼
    ImageButton group_button; //하단바의 참여 버튼
    ImageButton delivery_button; //하단바의 배달 버튼
    ImageButton profile_button; //하단바의 마이페이지 버튼
    ImageButton btnCart; //상단바의 장바구니 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_home);

        store1 = (ImageButton)findViewById(R.id.store1); //가게 버튼 -> 가게 상세 페이지로 이동
        store2 = (ImageButton)findViewById(R.id.store2); //가게 버튼 -> 가게 상세 페이지로 이동
        store3 = (ImageButton)findViewById(R.id.store3); //가게 버튼 -> 가게 상세 페이지로 이동
        store4 = (ImageButton)findViewById(R.id.store4); //가게 버튼 -> 가게 상세 페이지로 이동
        home_button = (ImageButton)findViewById(R.id.home_button);
        group_button = (ImageButton)findViewById(R.id.group_button);
        delivery_button = (ImageButton)findViewById(R.id.delivery_button);
        profile_button = (ImageButton)findViewById(R.id.profile_button);
        btnCart = (ImageButton) findViewById(R.id.btnCart);

        store1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerStore.class);
                startActivity(intent);
            }
        });

        store2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerStore.class);
                startActivity(intent);
            }
        });

        store3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerStore.class);
                startActivity(intent);
            }
        });

        store4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerStore.class);
                startActivity(intent);
            }
        });

        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_button.setEnabled(false);
            }
        }); //현재 Home screen 노출 중이므로, 비활성화시킴

        group_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerParticipate.class);
                startActivity(intent);
            }
        });

        delivery_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerMyDelivery.class);
                startActivity(intent);
            }
        });

        profile_button.setOnClickListener(new View.OnClickListener() {
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
    }
}