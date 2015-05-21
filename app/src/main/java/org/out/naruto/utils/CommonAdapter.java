package org.out.naruto.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Hao_S on 2015/5/4.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    protected Context context;
    protected List<T> datas;
    protected LayoutInflater layoutInflater;
    private int layoutId;


    public CommonAdapter(Context context,int layoutId, List<T> datas) {
        this.context = context;
        layoutInflater.from(context);
        this.datas = datas;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = ViewHolder.get(context, convertView, parent, layoutId, position);
        convert(viewHolder, getItem(position));
        return viewHolder.getConvertView();
    }

    public abstract void convert(ViewHolder viewHolder, T t);
}
