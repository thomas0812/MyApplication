package com.example.thoma.myapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

public class menumain extends TabActivity {
    private ListView m_ListView;
    private ListView m_ListView1;
    private ListView m_ListView2;
    private ArrayAdapter<String> m_Adapter;
    private ArrayAdapter<String> m_Adapter1;
    private ArrayAdapter<String> m_Adapter2;
    private  long lastTimeBackPressed;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view1);

        TabHost tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("오더보기").setContent(R.id.view1)
                .setIndicator("오더\n보기"));

        tabHost.addTab(tabHost.newTabSpec("배차정보").setContent(R.id.view2)
                .setIndicator("배차\n정보"));

        tabHost.addTab(tabHost.newTabSpec("제휴업체").setContent(R.id.view3)
                .setIndicator("제휴\n업체"));

        tabHost.addTab(tabHost.newTabSpec("추가정보").setContent(R.id.view4)
                .setIndicator("추가\n정보"));

        m_Adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.list_textviewme);
        m_ListView = (ListView) findViewById(R.id.list);
        m_ListView.setAdapter(m_Adapter);
        m_ListView.setOnItemClickListener(onClickListItem);

        m_Adapter.add("신청내역 1");
        m_Adapter.add("신청내역 2");
        m_Adapter.add("신청내역 3");
        m_Adapter.add("신청내역 4");
        m_Adapter.add("신청내역 5");
        m_Adapter.add("신청내역 6");
        m_Adapter.add("신청내역 7");
        m_Adapter.add("신청내역 8");
        m_Adapter.add("신청내역 9");
        m_Adapter.add("신청내역 10");
        m_Adapter.add("신청내역 11");
        m_Adapter.add("신청내역 12");
        m_Adapter.add("신청내역 13");
        m_Adapter.add("신청내역 14");
        m_Adapter.add("신청내역 15");


        m_Adapter1 = new ArrayAdapter<String>(getApplicationContext(),R.layout.list_textviewme);
        m_ListView1 = (ListView) findViewById(R.id.list1);
        m_ListView1.setAdapter(m_Adapter1);
        m_ListView1.setOnItemClickListener(onClickListItem1);

        m_Adapter1.add("배차정보 1");
        m_Adapter1.add("배차정보 2");
        m_Adapter1.add("배차정보 3");
        m_Adapter1.add("배차정보 4");
        m_Adapter1.add("배차정보 5");
        m_Adapter1.add("배차정보 6");
        m_Adapter1.add("배차정보 7");
        m_Adapter1.add("배차정보 8");
        m_Adapter1.add("배차정보 9");
        m_Adapter1.add("배차정보 10");
        m_Adapter1.add("배차정보 11");
        m_Adapter1.add("배차정보 12");
        m_Adapter1.add("배차정보 13");
        m_Adapter1.add("배차정보 14");
        m_Adapter1.add("배차정보 15");





        m_Adapter2 = new ArrayAdapter<String>(getApplicationContext(),R.layout.list_textviewme);
        m_ListView2 = (ListView) findViewById(R.id.list2);
        m_ListView2.setAdapter(m_Adapter2);
        m_ListView2.setOnItemClickListener(onClickListItem2);

        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 1");
        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 2");
        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 3");
        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 4");
        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 5");
        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 6");
        m_Adapter2.add("상호명/서비스명 \n 제품종류 및 소개 \n 주소 7");
    }
    private OnItemClickListener onClickListItem = new OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(getApplicationContext(), m_Adapter.getItem(arg2), Toast.LENGTH_SHORT).show();

            Intent detail = new Intent(getApplicationContext(), Detailview.class);
            startActivity(detail);
        }
    };
    private OnItemClickListener onClickListItem1 = new OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(getApplicationContext(), m_Adapter1.getItem(arg2), Toast.LENGTH_SHORT).show();

            Intent detail1 = new Intent(getApplicationContext(), Detailview1.class);
            startActivity(detail1);
        }
    };

    private OnItemClickListener onClickListItem2 = new OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(getApplicationContext(), m_Adapter2.getItem(arg2), Toast.LENGTH_SHORT).show();

            Intent detail1 = new Intent(getApplicationContext(), Afil_com_info.class);
            startActivity(detail1);
        }
    };

    @Override
    public void onBackPressed() {
        //1.5초 이내에 뒤로가기 버튼을 또 터치 할 경우 앱을 종료.
        if(System.currentTimeMillis() - lastTimeBackPressed <1500){
            finish();
            return;
        }
        Toast.makeText(this,("한번더 누르시면 앱이 종료 됩니다."),Toast.LENGTH_LONG).show();
        lastTimeBackPressed = System.currentTimeMillis();
    }
}
