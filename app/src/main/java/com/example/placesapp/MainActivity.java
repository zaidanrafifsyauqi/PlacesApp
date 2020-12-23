package com.example.placesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView staggeredRv;
    private StaggredRecyclerAdapter adapter;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);



        getSupportActionBar().hide();

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);

        //List
        List<row> lst = new ArrayList<>();
        lst.add(new row(R.drawable.place1));
        lst.add(new row(R.drawable.places2));
        lst.add(new row(R.drawable.places3));
        lst.add(new row(R.drawable.places4));
        lst.add(new row(R.drawable.places5));
        lst.add(new row(R.drawable.places6));
        lst.add(new row(R.drawable.places7));
        lst.add(new row(R.drawable.places8));
        lst.add(new row(R.drawable.place1));
        lst.add(new row(R.drawable.places2));
        lst.add(new row(R.drawable.places3));
        lst.add(new row(R.drawable.places4));
        lst.add(new row(R.drawable.places5));
        lst.add(new row(R.drawable.places6));
        lst.add(new row(R.drawable.places7));
        lst.add(new row(R.drawable.places8));
        lst.add(new row(R.drawable.place1));
        lst.add(new row(R.drawable.places2));
        lst.add(new row(R.drawable.places3));
        lst.add(new row(R.drawable.places4));
        lst.add(new row(R.drawable.places5));
        lst.add(new row(R.drawable.places6));
        lst.add(new row(R.drawable.places7));
        lst.add(new row(R.drawable.places8));
        lst.add(new row(R.drawable.place1));
        lst.add(new row(R.drawable.places2));
        lst.add(new row(R.drawable.places3));
        lst.add(new row(R.drawable.places4));
        lst.add(new row(R.drawable.places5));
        lst.add(new row(R.drawable.places6));
        lst.add(new row(R.drawable.places7));
        lst.add(new row(R.drawable.places8));

        adapter = new StaggredRecyclerAdapter(this,lst);
        staggeredRv.setAdapter(adapter);
    }
}