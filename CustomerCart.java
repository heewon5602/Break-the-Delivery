package com.example.breakthedelivery;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerCart extends AppCompatActivity {
    ImageButton home_button; //하단바의 홈 버튼
    ImageButton group_button; //하단바의 참여 버튼
    ImageButton delivery_button; //하단바의 배달 버튼
    ImageButton profile_button; //하단바의 마이페이지 버튼
    ImageButton btnCart; //상단바의 장바구니 버튼
    private ImageButton plus1;
    private ImageButton plus2;
    private ImageButton plus3;
    private ImageButton minus1;
    private ImageButton minus2;
    private ImageButton minus3;

    /*담은 메뉴에 대한 parameters*/
    Button btnDelete; //메뉴 삭제 버튼
    private ImageButton plus;
    private ImageButton minus;
    private Button btnOrder; //주문하기 버튼
    private TextView count1, count2, count3; //수량을 보여주는 TextView
    private int value1 = 0;
    private int value2 = 0;
    private int value3 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_cart);

        home_button = (ImageButton)findViewById(R.id.home_button);
        group_button = (ImageButton)findViewById(R.id.group_button);
        delivery_button = (ImageButton)findViewById(R.id.delivery_button);
        profile_button = (ImageButton)findViewById(R.id.profile_button);
        btnCart = (Button) findViewById(R.id.btnCart);
        count1 = (TextView) findViewById(R.id.count1);
        count1.setText(value1+"");
        count2 = (TextView) findViewById(R.id.count2);
        count2.setText(value2+"");
        count3 = (TextView) findViewById(R.id.count3);
        count3.setText(value3+"");
        plus1 = (ImageButton) findViewById(R.id.plus1);
        plus2 = (ImageButton) findViewById(R.id.plus2);
        plus3 = (ImageButton) findViewById(R.id.plus3);
        minus1 = (ImageButton) findViewById(R.id.minus1);
        minus2 = (ImageButton) findViewById(R.id.minus2);
        minus3 = (ImageButton) findViewById(R.id.minus3);
        btnOrder = (ImageButton)findViewById(R.id.btnOrder);

        /*장바구니 버튼*/
        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCart.setEnabled(false);
            }
        }); //같은 공간이므로 버튼 비활성화

        /*수량 증가 및 감소, 삭제 버튼들의 기능*/
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    value1++;
                    count1.setText(value1+"");
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2++;
                count2.setText(value2+"");
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value3++;
                count3.setText(value3+"");
            }
        });

        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1--;
                count1.setText(value1+"");
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2--;
                count2.setText(value2+"");
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value3--;
                count3.setText(value3+"");
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
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerHome.class);
                startActivity(intent);
            }
        });

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
    }
}