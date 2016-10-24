package com.example.hanyoojin.seoul;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hanyoojin on 2016. 10. 12..
 */
public class Fragment1 extends Fragment {
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab_fragment1, container, false);

        button = (Button)view.findViewById(R.id.btn1);

        //버튼 이벤트 추가
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);

                //intent.putExtra(DetailActivity.EXTRA_NAME, holder.mBoundString);

                context.startActivity(intent);
            }
        });
        return view;
    }



//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState){
//        super.onViewCreated(view, savedInstanceState);
//        TextView tv =  (TextView)view.findViewById(R.id.textView);
//        tv.setText("Fragment One");
//    }
}
