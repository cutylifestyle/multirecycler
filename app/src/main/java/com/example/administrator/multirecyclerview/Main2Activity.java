package com.example.administrator.multirecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity1";

    private DelegateAdapter delegateAdapter;
    private List<String> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView = findViewById(R.id.v_recycler);
        VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(this);
        recyclerView.setLayoutManager(virtualLayoutManager);

        //设置回收复用池大小，（如果一屏内相同类型的 View 个数比较多，需要设置一个合适的大小，防止来回滚动时重新创建 View）
        RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        recyclerView.setRecycledViewPool(viewPool);
        viewPool.setMaxRecycledViews(0, 20);


        delegateAdapter = new DelegateAdapter(virtualLayoutManager, true);
        recyclerView.setAdapter(delegateAdapter);

        List<DelegateAdapter.Adapter> adapters = new ArrayList<>();
        adapters.add(new SubAdapter(this, new LinearLayoutHelper(), 1){

            @Override
            public int getItemViewType(int position) {
                return 1;
            }

            @NonNull
            @Override
            public SubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                if(i == 1){
                    return new SubViewHolder(LayoutInflater.from(Main2Activity.this).inflate(R.layout.item_banner, viewGroup, false));
                }
                return super.onCreateViewHolder(viewGroup, i);
            }

            @Override
            public void onBindViewHolder(@NonNull SubViewHolder subViewHolder, int i) {
                if(subViewHolder.itemView instanceof Banner && images.size() >0){
                    Log.d(TAG, "onBindViewHolder");
                    Banner banner = (Banner) subViewHolder.itemView;
                    //设置banner样式
                    banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
                    //设置图片加载器
                    banner.setImageLoader(new GlideImageLoader());
                    //设置图片集合
                    banner.setImages(images);
                    //设置banner动画效果
                    banner.setBannerAnimation(Transformer.DepthPage);
                    //设置标题集合（当banner样式有显示title时）
                    //设置自动轮播，默认为true
                    banner.isAutoPlay(true);
                    //设置轮播时间
                    banner.setDelayTime(1500);
                    //设置指示器位置（当banner模式中有指示器时）
                    banner.setIndicatorGravity(BannerConfig.CENTER);
                    //banner设置方法全部调用完毕时最后调用
                    banner.start();
                }
            }
        });

        delegateAdapter.setAdapters(adapters);

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
                        images.clear();
                        FocusImages focusImages = homeEntity.getFocusImages();
                        for (FocusImages.FocusImageEntity entity : focusImages.getList()) {
                            images.add(entity.getPic());
                        }
                        delegateAdapter.notifyDataSetChanged();
                    }
                });
    }
}
