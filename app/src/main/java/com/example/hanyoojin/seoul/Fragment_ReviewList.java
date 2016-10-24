package com.example.hanyoojin.seoul;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by hanyoojin on 2016. 10. 12..
 */
public class Fragment_ReviewList extends Fragment {

  //  static final String[] LIST_MENU = {"★ 예체능관련분과", "동아리List2", "동아리List3","동아리List4","동아리List5","★ 문학관련분과","동아리List7","동아리List8","동아리List9","동아리List10","★ 봉사분과","동아리List12","동아리List13","동아리List14","동아리List15"} ;
  //  static final String[] LIST_MENU = {"댓글 1", "댓글 2 ", "댓글 3"};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<String> arDessert = new ArrayList<String>();
        arDessert.add("댓글 1");
        arDessert.add("댓글 2");
        arDessert.add("댓글 3");
        arDessert.add("댓글 4");

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_review_list,container,false);
        final ArrayAdapter Adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arDessert);

        ListView listview = (ListView) view.findViewById(R.id.listView);
        listview.setAdapter(Adapter);

        Button button = (Button) view.findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // TODO Auto-generated method stub
                EditText et = (EditText) view.findViewById(R.id.edit_review01);
                if(v.getId() == R.id.add) {
                    // 추가 버튼
                    if(et.getText().length() != 0){
                        arDessert.add(et.getText().toString());
                        et.setText("");
                        // 갱신되었음을 어댑터에 통보한다.
                        Adapter.notifyDataSetChanged();
                        //imm.hideSoftInputFromWindow(et.getWindowToken(), 0);

                    }
                }
            }
        });




//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
//                adapterView.getItemAtPosition(pos);
//                if (LIST_MENU == null) {
//                    Intent intent = new Intent(getActivity(), MainActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });  // 이문장은 함수 선언이 아니라 함수를 호출하는 부분입니다.
        return view;
    }


//
//    ListViewAdapter adapter;
//
//    @Override
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // View view = inflater.inflate(R.layout.fragment_layout, null);
//
//        //ArrayAdapter Adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU) ;
//
//        adapter = new ListViewAdapter();
//        setListAdapter(adapter);
//
//        // 첫 번째 아이템 추가.
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_account_box_black_36dp),
//                "Box", "Account Box Black 36dp") ;
//        // 두 번째 아이템 추가.
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_account_circle_black_36dp),
//                "Circle", "Account Circle Black 36dp") ;
//        // 세 번째 아이템 추가.
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_assignment_ind_black_36dp),
//                "Ind", "Assignment Ind Black 36dp") ;
//
//        //return inflater.inflate(R.layout.fragment_layout, container, false);
//        return super.onCreateView(inflater,container, savedInstanceState);
//    }
//
//    @Override
//    public void onListItemClick (ListView l, View v, int position, long id) {
//        // get TextView's Text.
//        ListViewItem item = (ListViewItem) l.getItemAtPosition(position) ;
//
//        String titleStr = item.getTitle() ;
//        String descStr = item.getDesc() ;
//        Drawable iconDrawable = item.getIcon() ;
//
//        // TODO : use item data.
//    }
//
//    public void addItem(Drawable icon, String title, String desc) {
//        adapter.addItem(icon, title, desc) ;
//    }
//
//
//    // ... 코드 계속
}