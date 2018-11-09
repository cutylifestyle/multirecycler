package com.example.administrator.multirecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

    private List<DiscoveryColumns.DiscoveryColumnEntity> mData;
    private Context mContext;

    public HorizontalAdapter(Context context,List<DiscoveryColumns.DiscoveryColumnEntity> data){
        mData = data;
        mContext = context;
    }

    @NonNull
    @Override
    public HorizontalAdapter.HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HorizontalViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subitem_horizontal_home,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter.HorizontalViewHolder horizantolViewHolder, int i) {
        DiscoveryColumns.DiscoveryColumnEntity entity = mData.get(i);
        horizantolViewHolder.bind(entity);
    }

    @Override
    public int getItemCount() {
        return mData == null? 0 :mData.size();
    }

    class HorizontalViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title;
        ImageView img_icon;

        HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            img_icon = itemView.findViewById(R.id.img_discovery);
            tv_title = itemView.findViewById(R.id.tv_discovery);
        }

        void bind(DiscoveryColumns.DiscoveryColumnEntity entity) {
            if (entity != null) {
                tv_title.setText(entity.getTitle());
                Glide.with(mContext).load(entity.getCoverPath()).into(img_icon);
            }
        }

    }

}
