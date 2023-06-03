package com.example.breakthedelivery;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerOrderHistory extends AppCompatActivity {
    TextView txtOrderHistory; //'주문내역' 상단탭에 출력
    TextView txtStore; //가게이름 출력
    TextView txtOrder; //주문내역 출력
    TextView txtSaving; //절약현황 출력

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order_history);

        txtOrderHistory = (TextView) findViewById(R.id.txtOrderHistory);
        txtStore = (TextView) findViewById(R.id.txtStore);
        txtOrder = (TextView) findViewById(R.id.txtOrder);
        txtSaving = (TextView) findViewById(R.id.txtSavin);
    }
}