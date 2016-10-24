package com.example.hanyoojin.seoul;

import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

public class MainActivity extends AppCompatActivity {


    FragmentTabHost mTabHost;
    Toolbar toolbar;
    Button toolbar_btn;
    DrawerLayout drawerLayout;


    private static final String TAB1 = "tab1";
    private static final String TAB2 = "tab2";
    private static final String TAB3 = "tab3";
    private static final String TAB4 = "tab4";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

//        toolbar = (Toolbar)findViewById(R.id.main_toolbar);
//        setSupportActionBar(toolbar);

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec(TAB1).setIndicator("홈"),
                Fragment1.class, null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB2).setIndicator("체크인"),
                Fragment2.class, null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB3).setIndicator("랭킹"),
                Fragment3.class, null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB4).setIndicator("마이페이지"),
                Fragment4.class, null);

//        toolbar_btn=(Button)findViewById(R.id.toolbar_btn);
//        toolbar_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "미구현 입니다.", Toast.LENGTH_SHORT).show();
//                //drawerLayout.openDrawer(Gravity.RIGHT);
//            }
//        });




    }
}