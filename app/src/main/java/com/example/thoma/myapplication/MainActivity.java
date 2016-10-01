package com.example.thoma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //마지막을 뒤로가기 버튼이 터치된 시간
    private  long lastTimeBackPressed;
    private ListView m_ListView;
    private ArrayAdapter<String> m_Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this,Intro.class));
    }

    @Override
    public void onBackPressed() {
        //1.5초 이내에 뒤로가기 버튼을 또 터치 할 경우 앱을 종료.
        if(System.currentTimeMillis() - lastTimeBackPressed <1500){
            finish();
            return;
        }
        lastTimeBackPressed = System.currentTimeMillis();
    }
    Button.OnClickListener btn = new View.OnClickListener(){
        public void onClick(View v){
            CheckBox cuscheck = (CheckBox) findViewById(R.id.cuscheck);
            EditText nameinput = (EditText) findViewById(R.id.name_input);
            String nameinput1 = nameinput.getText().toString();


            Log.v("EMS : ", "stap2");
            if (cuscheck.isChecked() == true) {
                Log.v("EMS : ", "stap2-1");
                if (nameinput1 == null || nameinput1.equals("") ) {
                    Log.v("EMS : ", "stap7");
                    Toast.makeText(
                            MainActivity.this, (CharSequence) ("기사명을 입력 하지 않으셨습니다."), Toast.LENGTH_SHORT).show();
                } else {
                    Log.v("EMS : ", "stap3");
                    // 이곳에 서버로 올려보낼 DATA를 INTENT를 이용해 전송할 수 있음.
                    Intent menumain1 = new Intent(getApplicationContext(), menumain.class);
                    Log.v("EMS : ", "stap3-1");

                    startActivity(menumain1);
                    Log.v("EMS : ", "stap3-2");
                    finish();
                }
            }
            else{
                Log.v("EMS : ","stap5");
                Log.v("EMS : ","stap5 N :"+nameinput1);
                Toast.makeText(
                        MainActivity.this, (CharSequence) ("약관 동의를 하지 않으셨습니다."), Toast.LENGTH_SHORT).show();
            }
        }
    };
}
//어플 종료
