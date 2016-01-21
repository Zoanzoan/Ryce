package com.example.administrator.ryce;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    MyAdapter myAdapter;
    View.OnClickListener onClickListener;
    RecyclerView recy;
    ArrayList<Person> listPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = (RecyclerView)findViewById(R.id.recy);
        listPerson = new ArrayList<Person>();
        listPerson.add(new Person("Aaaa", 15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));
        listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));
        listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));
        listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));
        listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));
        listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb",15));listPerson.add(new Person("Aaaa",15));
        listPerson.add(new Person("cccc",16));
        listPerson.add(new Person("bbbb", 15));










        recy.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(listPerson);
        recy.setAdapter(myAdapter);
        recy.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Created by Administrator on 1/15/2016.
     */
}
