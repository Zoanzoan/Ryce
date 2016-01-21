package com.example.administrator.ryce;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Administrator on 1/15/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private ArrayList<Person> listPerson;
    Context context;
    View.OnClickListener onClickListener;
    public MyAdapter(ArrayList<Person> listPerson, Context context) {
        this.listPerson = listPerson;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Person person = listPerson.get(position);
        holder.name.setText(person.getName());
        holder.age.setText(person.getAge()+"");

    }

    @Override
    public int getItemCount() {
        return listPerson.size();
    }
    public class RecyItemClickListener implements RecyclerView.OnItemTouchListener
    {

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {

        }
    }
}
