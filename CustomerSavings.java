package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.TextView;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Calendar;
public class CustomerSavings extends AppCompatActivity {
    TextView txtSavings; //'배달타파 절약현황'이라는 UI 제목의 id 임의 설정
    TextView txtMonth; //'MONTH TOTAL'이라는 텍스트의 id 임의 설정
    TextView txtMonthSavings; //'XXXX원 saved!"
    TextView txtToday; //'Today'
    TextView txtYesterday; //'Yesterday'
    TextView txtTodayDate; //'ex) 30 March'
    TextView txtYesterdayDate; //'ex) 30 March'
    TextView txtHistory; //'배달 내역'
    TextView txtPrice; //'+XXXX원'


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_savings);

        txtSavings = (TextView) findViewById(R.id.txtSavings);
        txtMonth = (TextView) findViewById(R.id.txtMonth);
        txtMonthSavings = (TextView) findViewById(R.id.txtMonthSavings);
        txtToday = (TextView) findViewById(R.id.txtToday);
        txtYesterday = (TextView) findViewById(R.id.txtYesterday);
        txtTodayDate = (TextView) findViewById(R.id.txtTodayDate);
        txtYesterdayDate = (TextView) findViewById(R.id.txtYesterdayDate);
        txtHistory = (TextView) findViewById(R.id.txtHistory);
        txtPrice = (TextView) findViewById(R.id.txtPrice);

        //날짜 출력하기
        Calendar calendar = Calendar.getInstance();
        int m = 1, d = 1;
        int newD = 1; //m: 월, d: 일, newD:어제날짜 게산 시, d-1=0인 경우의 조건문에 사용
        int yesterdayDate = d - 1; //yesterdayDate 계산을 위한 format
        String month; //ex)1월: January로 출력하는 switch 조건문에 사용

        m = calendar.get(Calendar.MONTH);
        d = calendar.get(Calendar.DAY_OF_MONTH);

        //오늘 날짜 출력하기 (ex. 30 March)
        switch (m) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "Feburary";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "month";
                break;
        }
        txtTodayDate.setText(d + "\r\n" + month);

        //어제 날짜 계산 및 출력하기 (ex. 30 March)
        if (yesterdayDate == 0) {
            if (month == "January") {
                newD = 31;
                month = "December";
            } else if (month == "Feburary") {
                newD = 31;
                month = "January";
            } else if (month == "March") {
                newD = 28;
                month = "Feburary";
            } else if (month == "April") {
                newD = 31;
                month = "March";
            } else if (month == "May") {
                newD = 30;
                month = "April";
            } else if (month == "June") {
                newD = 31;
                month = "May";
            } else if (month == "July") {
                newD = 30;
                month = "June";
            } else if (month == "August") {
                newD = 31;
                month = "July";
            } else if (month == "September") {
                newD = 31;
                month = "August";
            } else if (month == "October") {
                newD = 30;
                month = "September";
            } else if (month == "November") {
                newD = 31;
                month = "October";
            } else {
                newD = 30;
                month = "November";
            }
            txtYesterdayDate.setText(newD + "\r\n" + month);
        } else txtYesterdayDate.setText(yesterdayDate + "\r\n" + month);
    }
}