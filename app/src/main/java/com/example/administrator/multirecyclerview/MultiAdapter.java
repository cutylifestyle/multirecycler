package com.example.administrator.multirecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.Collection;
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

        if(i == TYPE_SLIDER_HORIZANTOR){
            return new HorizantolViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_horizantol_home, viewGroup, false));
        }

        if(i == TYPE_LIST_VERTICAL){
            return new VerticalViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_vertical_home, viewGroup, false));
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        HomeBaseEntity homeBaseEntity = mData.get(i);
        if (homeBaseEntity instanceof FocusImages && viewHolder instanceof HeaderViewHolder) {
            ((HeaderViewHolder)viewHolder).bind(homeBaseEntity);
        } else if (homeBaseEntity instanceof DiscoveryColumns && viewHolder instanceof HorizantolViewHolder) {
            ((HorizantolViewHolder)viewHolder).bind(homeBaseEntity);
        } else if (homeBaseEntity instanceof EditorRecommendAlbums || homeBaseEntity instanceof SpecialColumns && viewHolder instanceof VerticalViewHolder) {
            Log.d(TAG, "homeBaseEntity");
            ((VerticalViewHolder)viewHolder).bind(homeBaseEntity);
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

    public void addAll(List<HomeBaseEntity> collection) {
        addAll(mData.size(), collection);
    }

    public void addAll(int position,List<HomeBaseEntity> collection) {
        if (collection == null) {
            return;
        }
        mData.addAll(position, collection);
        notifyItemRangeInserted(position, collection.size());
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
//            Log.d(TAG, homeBaseEntity.toString());
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

    class HorizantolViewHolder extends RecyclerView.ViewHolder{

        RecyclerView mHorizantolRecycler;

        HorizantolViewHolder(@NonNull View itemView) {
            super(itemView);
            mHorizantolRecycler = itemView.findViewById(R.id.horizontal_recycler_view);
            mHorizantolRecycler.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
        }

        void bind(HomeBaseEntity homeBaseEntity) {
            List<DiscoveryColumns.DiscoveryColumnEntity> data = ((DiscoveryColumns) homeBaseEntity).getList();
            mHorizantolRecycler.setAdapter(new HorizontalAdapter(mContext,data));
        }
    }

    class VerticalViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_title;
        private TextView tv_more;
        private ListView list_item;


        VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_more = itemView.findViewById(R.id.tv_more);
            list_item = itemView.findViewById(R.id.item_list);
        }

        void bind(HomeBaseEntity homeBaseEntity) {
            Log.d(TAG, homeBaseEntity.toString());
            if (homeBaseEntity instanceof EditorRecommendAlbums) {
                EditorRecommendAlbums editorRecommendAlbums = (EditorRecommendAlbums) homeBaseEntity;
                tv_title.setText(editorRecommendAlbums.getTitle());
                List<EditorRecommendAlbums.EditorRecommendAlbumsEntity> albumsEntities = editorRecommendAlbums.getList();
                list_item.setAdapter(new ListAdapter(albumsEntities));

            } else if (homeBaseEntity instanceof SpecialColumns) {
                SpecialColumns specialColumns = (SpecialColumns) homeBaseEntity;
                tv_title.setText(specialColumns.getTitle());
                List<SpecialColumns.SpecialColunmnEntity> specialColunmnEntities = specialColumns.getList();
                list_item.setAdapter(new ListAdapter1(specialColunmnEntities));
            }
        }
    }

}
