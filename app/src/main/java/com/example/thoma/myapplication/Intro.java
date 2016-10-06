package com.example.thoma.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by thoma on 2016-10-01.
 */

public class Intro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main);
        ImageView mImage = (ImageView) findViewById(R.id.imagepre);
        mImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Handler handler = new Handler();
        // 2초 동안 시작 페이지를 띄우고 종료한다.
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },2000);
    }
}
