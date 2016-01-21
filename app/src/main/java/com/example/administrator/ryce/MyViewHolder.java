package com.example.administrator.ryce;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 1/15/2016.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    protected TextView name;
    protected TextView age;
    public MyViewHolder(View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.txt1);
        age = (TextView)itemView.findViewById(R.id.txt2);
    }
}
