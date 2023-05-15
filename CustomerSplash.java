package com.example.breakthedelivery;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import android.os.Bundle;
import android.widget.ImageView;

public class CustomerSplash extends AppCompatActivity {
    ImageView imgLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_splash);

        imgLoading = (ImageView) findViewById(R.id.imgLoading);
        Glide.with(this).load.(R.drawable.gifLoading).into(imgLoading);
    }
}