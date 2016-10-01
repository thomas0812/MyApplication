package com.example.thoma.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by taehwon on 2016-03-30.
 */
public class Detailview1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operate_detail_data);
        findViewById(R.id.close).setOnClickListener(closed);
    }
    Button.OnClickListener closed = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
             finish();
        }
    };

}