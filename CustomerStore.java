package com.example.breakthedelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerStore extends AppCompatActivity {
    TextView Storename; //가게 이름
    TextView Storeaddress; //가게 주소
    TextView StoreDetail; //가게 상세설명 및 공지
    Button btnMenu; //음식 버튼 (음식 상세 설명 view 보임)
    Button btnOk; //음식 상세 설명 view를 끄게 할 버튼
    Button btnJoin; //참여 버튼
    Button btnCreate; //참여방 생성 버튼
    Button btnToCart; //장바구니 담기 버튼 (자신이 참여 중 && 참여 인원 채워졌을 떄에만 활성화)
    Button btnHome; //하단바의 홈 버튼
    Button btnParticipate; //하단바의 참여 버튼
    Button btnDelivery; //하단바의 배달 버튼
    Button btnMyPage; //하단바의 마이페이지 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        Storename = (TextView) findViewById(R.id.Storename);
        Storeaddress = (TextView) findViewById(R.id.Storeaddress);
        StoreDetail = (TextView) findViewById(R.id.StoreDetail);
        btnMenu = (Button) findViewById(R.id.btnMenu);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnJoin = (Button) findViewById(R.id.btnJoin);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnToCart = (Button) findViewById(R.id.btnToCart);
        btnHome = (Button)findViewById(R.id.btnHome);
        btnParticipate = (Button)findViewById(R.id.btnParticipate);
        btnDelivery = (Button)findViewById(R.id.btnDelivery);
        btnMyPage = (Button)findViewById(R.id.btnMypage);
        
        /*하단바 버튼들의 기능*/
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHome.setEnabled(false);
            }
        }); //현재 Home screen 노출 중이므로, 비활성화시킴

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

        /*Store에 대한 버튼들의 기능*/
        LinearLayout MenuDetail, CreateRoom; //레이아웃 등록

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuDetail.setVisibility(LinearLayout.VISIBLE);
            }
        }); //음식 버튼 터치 -> 음식에 대한 상세 설명 화면 노출

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuDetail.setVisibility(LinearLayout.INVISIBLE);
            }
        }); //확인 버튼 터치 -> 음식 상세 설명 화면 사라짐

        /*btnToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if()
            }
        }); */

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomerStore.this, "참여되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateRoom.setVisibility(LinearLayout.VISIBLE);
            }
        });


    }
}
