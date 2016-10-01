package com.example.thoma.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by taehwon on 2016-03-29.
 */
public class Detailview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_detail_info);
        findViewById(R.id.bus_detail).setOnClickListener(detail);
    }
    Button.OnClickListener detail = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.v("EMS : ", "detail1");
            AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Detailview.this);
            Log.v("EMS : ", "detail2");
            alert_confirm.setMessage("신청하시겠습니까?").setCancelable(false).setPositiveButton("신청",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // 'YES'
                            Log.v("EMS : ", "detail3");
                            finish();
                        }
                    }).setNegativeButton("취소",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // 'No'
                            Log.v("EMS : ", "detail4");
                            dialog.cancel();
                        }
                    });
            Log.v("EMS : ", "detail5");
            AlertDialog alert = alert_confirm.create();
            alert.show();

        }
    };
}