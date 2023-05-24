package com.example.breakthedelivery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomerParticipateStatus extends AppCompatActivity {
    public ArrayList<String> arrayParticipateRoom; //참여를 위해 만들어진 방들의 리스트

    public ListView participateRoom;
    private Context context;
    private RecyclerView.Adapter adapter;

    int count = 1; //생성자는 참여 상태이므로 1로 초기화해줌
    EditText edtSearch; //검색어를 입력할 검색창
    TextView txtBTD; //BreakTheDelivery라는 어플 이름
    TextView txtStorename; //가게이름
    TextView txtOrderTime; //주문 시간
    TextView txtNumber; //참여 인원
    TextView txtTotalNumber; //생성자가 설정한 총 참여 가능 인원 수
    Button btnParticipate; //참여 버튼


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_participate_status);
        this.context = getApplicationContext();

        txtBTD = (TextView)findViewById(R.id.btnBTD);
        edtSearch = (EditText) findViewById(R.id.Search); //xml에서 search 라는 id를 가진 EditText layout 가져오기
        txtStorename = (TextView)findViewById(R.id.Storename); //가게 이름
        txtOrderTime = (TextView)findViewById(R.id.OrderTime); //주문할 시간
        txtNumber = (TextView)findViewById(R.id.Number); //현재 참여된 인원 수
        txtTotalNumber = (TextView)findViewById(R.id.TotalNumber); //모집할 인원 수
        btnParticipate = (Button)findViewById(R.id.btnParticipate); //참여 버튼

        btnParticipate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnParticipate.getText() == "참여") {
                    count++;
                    txtNumber.setText("");
                    btnParticipate.setText("참여 취소");
                    Toast.makeText(CustomerParticipateStatus.this, "참여되었습니다", Toast.LENGTH_SHORT).show();
                } //참여 버튼 클릭 : 참여 인원 수 증가, 버튼 텍스트 변경, 토스트 메시지 출력
                else {
                    count--;
                    txtNumber.setText("");
                    btnParticipate.setText("참여");
                    Toast.makeText(CustomerParticipateStatus.this, "참여 취소되었습니다", Toast.LENGTH_SHORT).show();
                } //참여 취소 버튼 클릭 : 참여 인원 수 감소, 버튼 텍스트 변경, 토스트 메시지 출력

               if (txtNumber == txtTotalNumber) btnParticipate.setEnabled(false);
                // 참여 가능 인원 수와 참여 인원 수가 동일해지면 버튼 비활성화됨
                else btnParticipate.setEnabled(true); // 참여 가능 인원 수와 참여 인원 수가 다르면 버튼 활성화됨
            }
        });

        edtSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_SEARCH) {
                    return true;
                } return false;
            }
        });

        //editText의 검색어 실시간 변화를 관찰하는 인터페이스

        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int s, int n, int tn) {

            }
            /* 텍스트 변경 전
             charSequence : 기존 문자열, s: 커서 시작 위치, n: 변경 대상 문자 수, tn(total number): 변경 후 문자 수 */

            @Override
            public void onTextChanged(CharSequence charSequence, int s, int n, int tn) {
                if(edtSearch.getText().length() >= 50)
                    Toast.makeText(CustomerParticipateStatus.this, "20자 이내로 입력하세요", Toast.LENGTH_SHORT).show();
            }
            /* 텍스트 변경 시
            charSequence : 기존 문자열, s: 커서 시작 위치, n: 변경 대상 문자 수, tn(total number): 변경 후 문자 수
             */

            @Override
            public void afterTextChanged(Editable editable) {
                String search = edtSearch.getText().toString().trim(); //edtSearch의 텍스트를 공백 제외하고 가져와 search라는 변수에 문자열로 저장

            }
            /* 텍스트 변경 후
            editable: 변경된 문자열
             */
        });
    }
    }