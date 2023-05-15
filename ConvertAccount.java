/*Customer, delivery man, store owner 3개 유형의 mypage에서 모두 이용됨*/
package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConvertAccount extends AppCompatActivity {
    TextView txtBTD; //BreakTheDelivery라는 어플 이름
    TextView txtCustomerNickname; //동일 계정주의 customer 유형의 nickname
    TextView txtCustomerId; //동일 계정주의 customer 유형의 id
    TextView txtStoreNickname; //동일 계정주의 store owner 유형의 nicknname
    TextView txtStoreId; //동일 계정주의 store owner 유형의 id
    TextView txtDeliverNickname; //동일 계정주의 delivery man 유형의 nickname
    TextView txtDeliverId; //동일 계정주의 delivery man 유형의 id
    Button btnCustomer; //계정전환 버튼
    Button btnStore; //계정전환 버튼
    Button btnDeliver; //계정전환 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_account);

        txtBTD = (TextView) findViewById(R.id.txtBTD);
        txtCustomerNickname = (TextView)findViewById(R.id.CustomerNickname);
        txtCustomerId = (TextView) findViewById(R.id.CustomerId);
        txtStoreNickname = (TextView) findViewById(R.id.StoreNickname); //동일 계정주의 store owner 유형의 nicknname
        txtStoreId = (TextView) findViewById(R.id.StoreId); //동일 계정주의 store owner 유형의 id
        txtDeliverNickname = (TextView) findViewById(R.id.DeliverNickname); //동일 계정주의 delivery man 유형의 nickname
        txtDeliverId = (TextView) findViewById(R.id.DeliveryId); //동일 계정주의 delivery man 유형의 id
        btnCustomer = (Button) findViewById(R.id.btnCustomer); //계정전환 버튼
        btnStore = (Button) findViewById(R.id.btnStore); //계정전환 버튼
        btnDeliver = (Button) findViewById(R.id.btnDeliver); //계정전환 버튼

        switch (/*계정유형*/) {
            case :/*customer 유형이라면*/
                btnCustomer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btnCustomer.setEnabled(false);
                    }
                }); //이미 customer 유형의 UI내이므로 버튼을 비활성화시켜줌
                break;
            case :/*계정이 delivery man 유형이라면*/
                btnDeliver.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext().DeliverySplash. class);
                        StartActivityForResult(intent, DeliverySplash);
                    }
                }); //버튼을 누르면 배달원 유형의 스플래시 화면(DeliverySplash)으로 이동
                break;
            case :/*계정이 store owner 유형이라면*/
                btnStore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext().StoreSplash. class);
                        StartActivityForResult(intent, StoreSplash);
                    }
                }); //버튼을 누르면 가게주인 유형의 스플래시 화면(DeliverySplash)으로 이동
                break;
        }
    }
}