package com.example.administrator.multirecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MultiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String TAG = "MultiAdapter";
    private Context mContext;
    private List<HomeBaseEntity> mData;
    private static final int TYPE_HEADER_VIEWPAGER = 1;
    private static final int TYPE_SLIDER_HORIZANTOR = 2;
    private static final int TYPE_LIST_VERTICAL = 3;

    public MultiAdapter(Context context,List<HomeBaseEntity> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(i == TYPE_HEADER_VIEWPAGER){
            return new HeaderViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_header_home,viewGroup,false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        HomeBaseEntity homeBaseEntity = mData.get(i);
        if (homeBaseEntity instanceof FocusImages && viewHolder instanceof HeaderViewHolder) {
            ((HeaderViewHolder)viewHolder).bind(homeBaseEntity);
        }
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0:mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return TYPE_HEADER_VIEWPAGER;
        }
        if(position == 1){
            return TYPE_SLIDER_HORIZANTOR;
        }
        if(position > 1){
            return TYPE_LIST_VERTICAL;
        }
        return super.getItemViewType(position);
    }

    void add(int position,HomeBaseEntity homeBaseEntity) {
        if (homeBaseEntity == null) {
            return;
        }
        mData.add(position,homeBaseEntity);
        notifyItemInserted(position);
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder{

        Banner mBanner;

         HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            mBanner = itemView.findViewById(R.id.banner_header);
            //设置banner样式
             mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
             //设置图片加载器
             mBanner.setImageLoader(new GlideImageLoader());
             //设置banner动画效果
             mBanner.setBannerAnimation(Transformer.DepthPage);
             //设置标题集合（当banner样式有显示title时）
//             banner.setBannerTitles(titles);
             //设置自动轮播，默认为true
             mBanner.isAutoPlay(true);
             //设置轮播时间
             mBanner.setDelayTime(1500);
             //设置指示器位置（当banner模式中有指示器时）
             mBanner.setIndicatorGravity(BannerConfig.CENTER);
        }

        void bind(HomeBaseEntity homeBaseEntity) {
            Log.d(TAG, homeBaseEntity.toString());
            FocusImages focusImages = (FocusImages) homeBaseEntity;
            List<String> images = new ArrayList<>();
            for (FocusImages.FocusImageEntity entity : focusImages.getList()) {
                images.add(entity.getPic());
            }
            //设置图片集合
            mBanner.setImages(images);
            //banner设置方法全部调用完毕时最后调用
            mBanner.start();
        }
    }

}
