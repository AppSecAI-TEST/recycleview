package com.example.bat_man.recycleviewdemo.mian2adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 类描述 ：
 * 姓名 ：喻荣强
 * 时间 ：2017-
 */

public class Main2Line extends RecyclerView.ItemDecoration {
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(8,8,8,8);
    }
}
