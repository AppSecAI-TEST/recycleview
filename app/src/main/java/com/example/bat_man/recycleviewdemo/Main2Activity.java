package com.example.bat_man.recycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bat_man.recycleviewdemo.mian2adapter.Main2Line;
import com.example.bat_man.recycleviewdemo.mian2adapter.MyItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView recyclerView;
    List<MyItem> list;
    private Main2Adapter main2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            switch (i) {
                case 0:
                    list.add(new MyItem("第  " + i + " 条 ", 0));
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    list.add(new MyItem("第  " + i + " 条 ", 1));
                    break;
                case 5:
                    list.add(new MyItem("第  " + i + " 条 ", 2));
                    break;
                default:
                    list.add(new MyItem("第  " + i + " 条 ", 3));
                    break;

            }

        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 12);
        recyclerView.setLayoutManager(gridLayoutManager);

        main2Adapter = new Main2Adapter(list);
        recyclerView.setAdapter(main2Adapter);
        recyclerView.addItemDecoration(new Main2Line());
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                MyItem item = main2Adapter.getitem(position);
                switch (item.type) {
                    case 0:
                        return 12;
                    case 1:

                        return 3;
                    case 2:

                        return 12;

                    default:
                        return 6;

                }

            }
        });

    }
}
