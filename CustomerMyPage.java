/*Customer의 Mypage UI*/
package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomerMyPage extends AppCompatActivity {
    TextView txtBTD; //BreakTheDelivery라는 어플 이름
    TextView txtNickname; //로그인한 user의 nickname명
    TextView txtId; //로그인한 user의 Id명
    Button btnParticipate; //참여현황
    Button btnHistory; //주문내역
    Button btnSavings; //절약현황
    Button btnConvert; //계정전환

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_my_page);
        txtBTD = (TextView)findViewById(R.id.txtBTD);
        txtNickname = (TextView)findViewById(R.id.txtNickname);
        txtId = (TextView)findViewById(R.id.txtId);
        btnParticipate = findViewById(R.id.btnParticipate);
        btnHistory = findViewById(R.id.btnHistory);
        btnSavings = findViewById(R.id.btnSavings);
        btnConvert = findViewById(R.id.btnConvert);

        btnParticipate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().ParticipateStatus.class);
                StartActivityForResult(intent, ParticipateStatus);
            }
        }); //버튼을 누르면 참여현황(ParticipateStauts) UI로 이동

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().HistoryOrder.class);
                StartActivityForResult(intent, HistoryOrder);
            }
        }); //버튼을 누르면 주문내역(History Order)UI로 이동

        btnSavings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().MySavings.class);
                StartActivityForResult(intent, MySavings);
            }
        }); //버튼을 누르면 절약현황(MySavings) UI로 이동

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().ConvertAccount.class);
                StartActivityForResult(intent, ConvertAccount);
            }
        }); //버튼을 누르면 계정전환(ConvertAccount) UI로 이동
    }
}