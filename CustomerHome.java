package com.example.breakthedelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CustomerHome extends AppCompatActivity {
    TextView txtBTD; //최상단의 어플 이름 '배달타파' 출력
    Button btnStore; //각 store (가게 사진, 가게 이름으로 구성)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        txtBTD = (TextView)findViewById(R.id.btnBTD);
        btnStore = (Button)findViewById(R.id.btnStore); //가게 버튼 -> 가게 상세 페이지로 이동

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerStoreList.class);
                startActivity(intent);
            }
        });
    }
}