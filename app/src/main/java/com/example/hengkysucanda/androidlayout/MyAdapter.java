package com.example.hengkysucanda.androidlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hengkysucanda on 10/4/14.
 */

public class MyAdapter extends BaseAdapter {

    private  Context context;
    private ArrayList<Data> arrayList;
    public MyAdapter(Context context, ArrayList<Data> arrayList){
       this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Data getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Holder holder;
        if(view == null){
            holder = new Holder();
            view = inflater.inflate(R.layout.list_item_custom, viewGroup, false);
            holder.imageview = (ImageView)view.findViewById(R.id.image);
            holder.title = (TextView)view.findViewById(R.id.title);
            holder.description = (TextView)view.findViewById(R.id.description);
            view.setTag(holder);
        }
        else{
            holder = (Holder)view.getTag();
        }

        holder.description.setText(getItem(position).getDescription());
        return view;
    }
    class Holder{
        ImageView imageview;
        TextView title;
        TextView description;
    }
}
