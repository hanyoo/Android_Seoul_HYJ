package com.example.hanyoojin.seoul;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hanyoojin on 2016. 10. 12..
 */
public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.tab_fragment3, container, false);
    }
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState){
//        super.onViewCreated(view, savedInstanceState);
//        TextView tv =  (TextView)view.findViewById(R.id.textView);
//        tv.setText("Fragment One");
//    }
}
