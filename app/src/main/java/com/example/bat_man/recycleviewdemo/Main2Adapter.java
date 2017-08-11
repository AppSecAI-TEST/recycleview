package com.example.bat_man.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bat_man.recycleviewdemo.mian2adapter.MyItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 类描述 ：
 * 姓名 ：喻荣强
 * 时间 ：2017-
 */

public class Main2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<MyItem> list;

    public Main2Adapter(List<MyItem> list) {
        this.list = list;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                return new ImageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false));
            case 1:
                return new TitleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title, parent, false));
            case 2:
                return new SmallViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_simall, parent, false));
            default:
                return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
        }


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).tv.setText(list.get(position).user);
        }
    }

    @Override
    public int getItemViewType(int position) {
        MyItem item = list.get(position);
        return item.type;
    }

    public MyItem getitem(int position) {
        return list.get(position);

    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv)
        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {


        public ImageViewHolder(View itemView) {
            super(itemView);

        }
    }

    class TitleViewHolder extends RecyclerView.ViewHolder {

        public TitleViewHolder(View itemView) {
            super(itemView);

        }
    }

    class SmallViewHolder extends RecyclerView.ViewHolder {

        public SmallViewHolder(View itemView) {
            super(itemView);

        }
    }
}
