package com.example.administrator.multirecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    //TODO 如果需求变动，布局的位置发生改变，变动是否很大的问题
    //TODO 如何停止自动播放
    //TODO 设置Banner的点击事件
    private static final String TAG = "MainActivity111";
    private MultiAdapter multiAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = findViewById(R.id.multi_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mRecyclerView.setAdapter(multiAdapter = new MultiAdapter(this,new ArrayList<HomeBaseEntity>()));
        getData();
    }

    private void getData() {
        OkGo.<String>get("http://mobile.ximalaya.com/mobile/discovery/v3/recommends?channel=and-a1&device=android&includeActivity=true&includeSpecial=true&scale=2&version=4.3.98")
             .tag("FirstPage")
             .execute(new StringCallback() {

                 @Override
                 public void onError(Response<String> response) {
                     super.onError(response);
                     Log.d(TAG, response.message());
                 }

                 @Override
                 public void onSuccess(Response<String> response) {
                     Gson gson = new Gson();
                     HomeEntity homeEntity = gson.fromJson(response.body(), HomeEntity.class);
                     Log.d(TAG, homeEntity.toString());
                     multiAdapter.add(0,homeEntity.getFocusImages());
                     multiAdapter.add(1,homeEntity.getDiscoveryColumns());
                     multiAdapter.add(2,homeEntity.getEditorRecommendAlbums());
                     multiAdapter.add(3,homeEntity.getSpecialColumn());
                 }
             });
    }
}
