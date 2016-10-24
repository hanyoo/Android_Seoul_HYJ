package com.example.hanyoojin.seoul;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
//import android.app.ListFragment;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by hanyoojin on 2016. 10. 12..
 */
public class DetailActivity extends AppCompatActivity {


    ListFragment listFragment;
    EditText editText;
    Button btn;

    public static final String EXTRA_NAME = "경복궁";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        FragmentManager fm = getSupportFragmentManager();
        listFragment = (ListFragment) fm.findFragmentById(R.id.listfragment);

//        editText = (EditText)findViewById(R.id.edit_review);
//        btn = (Button)findViewById(R.id.btn_review);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(DetailActivity.this, "댓글등록해야해", Toast.LENGTH_SHORT).show();
//            }
//        });

        //Intent intent = getIntent();
        //final String cheeseName = intent.getStringExtra(EXTRA_NAME);
        final String LocationTitle = EXTRA_NAME;

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
   //     getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);



        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(LocationTitle);

        loadBackdrop();
        floatingfab();
    }

    private void loadBackdrop() {
        final ImageView imageview01 = (ImageView) findViewById(R.id.backdrop);
        imageview01.setImageResource(R.drawable.location02);
       // setContentView(imageview01);
        //Glide.with(this).load(Cheeses.getRandomCheeseDrawable()).centerCrop().into(imageView);
    }

    private void floatingfab(){
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailActivity.this, "I.SEOUL.U", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.sample_actions, menu);
//        return true;
//    }
}
