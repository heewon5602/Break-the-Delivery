/*로그인 화면*/
package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    TextView labelSignIn;
    TextView labelId;
    TextView labelPassword;
    EditText txtId;
    EditText txtPassword;
    Button btnNext;
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        context = getApplicationContext();

        labelSignIn = findViewById(R.id.labelSignIn); //xml에서 textView 형태 최상단 문자열의 아이디도 labelStore라고 가정
        labelId = findViewById(R.id.labelId); //xml에서 textView 형태 Id의 아이디도 labelId라고 가정
        labelPassword = findViewById(R.id.labelPassword); //xml에서 textView 형태 Password의 아이디도 labelPassword라고 가정
        txtId = findViewById(R.id.txtId); //xml에서 editView 형태 Id의 아이디도 txtId라고 가정
        txtPassword = findViewById(R.id.txtPassword); //xml에서 editView 형태 Password의 아이디도 txtPassword라고 가정

/*아이디와 비밀번호 입력 후, next 버튼을 누르면 
해당 아이디와 비밀번호가 데이터베이스에 저장되어 있는 것과 동일할 시, 해당 유형의 UI로 이동하는 코드 작성 필요
 */

}