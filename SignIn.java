/*로그인 화면*/
package com.example.breakthedelivery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    EditText customer_id;
    EditText customer_pw;
    Button button_next;
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        context = getApplicationContext();

        customer_id = findViewById(R.id.customer_id); //xml에서 editView 형태 Id의 아이디도 txtId라고 가정
        customer_pw = findViewById(R.id.customer_pw); //xml에서 editView 형태 Password의 아이디도 txtPassword라고 가정
        button_next = findViewById(R.id.button_next);

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this, Splash.class);
                startActivity(intent);
            }
        }); /*아이디와 비밀번호 입력 후, next 버튼을 누름 ->
        해당 아이디와 비밀번호가 데이터베이스에 저장되어 있는 것과 동일할 시, 해당 유형의 UI로 이동*/

    }
}
