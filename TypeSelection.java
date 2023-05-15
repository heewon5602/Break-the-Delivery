/*사용자의 유형(고객, 배달원, 가게주인) 선택창 (회원가입의 첫번째 단계)*/
package com.example.breakthedelivery;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TypeSelection extends AppCompatActivity {
    TextView txtType; //User Type Selecton text의 id
    Button btnCustomer; //Custoer button의 아이디
    Button btnDelivery; //Delivery Man의 아이디
    Button btnStore; //Store Owner의 아이디

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_selection);

        txtType = (TextView)findViewById(R.id.txtType);
        btnCustomer = findViewById(R.id.customer); //CustomerCreate로 향하는 button 'customer'의 id 가져옴
        btnDelivery = findViewById(R.id.delivery); //DeliveryCreate로 향하는 button 'delivery'의 id 가져옴
        btnStore = findViewById(R.id.store); //StoreCreate로 향하는 button 'store'의 id 가져옴

        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().CustomerCreate.class);
                StartActivityForResult(intent, CustomerCreate);
            }
        });

        btnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().DeliveryCreate.class);
                StartActivityForResult(intent, DeliveryCreate);
            }
        });

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext().StoreCreate.class);
                StartActivityForResult(intent, StoreCreate);
            }
        });
    }
}