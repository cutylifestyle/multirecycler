package com.example.administrator.multirecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView recyclerView = findViewById(R.id.re_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,6,LinearLayoutManager.VERTICAL,false));

    }
}
