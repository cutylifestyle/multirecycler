package com.example.administrator.multirecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Map;

public class GridAdapter<D> extends RecyclerView.Adapter {

    private Context mContext;
    private Map<String,Integer> mMapType;
    private Map<Integer,Integer> mMapGridSize;
    private List<D> mData;

    public GridAdapter(Context context,Map<String,Integer> mapType,Map<Integer,Integer> mapGridSize,List<D> data) {
        mContext = context;
        mMapType = mapType;
        mMapGridSize = mapGridSize;
        mData = data;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i) {
                    int viewType = getItemViewType(i);

                    if (mMapGridSize == null) {
                        return 1;
                    }

                    return mMapGridSize.get(viewType) == null ? 1 : mMapGridSize.get(viewType);

                }
            });
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BaseViewHolder(LayoutInflater.from(mContext).inflate(i,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public int getItemViewType(int position) {

        D data = mData.get(position);

        if (mMapType == null) {
            return super.getItemViewType(position);
        }

        if (data == null) {
            return super.getItemViewType(position);
        }

        return mMapType.get(data.getClass().getSimpleName());

    }

    class BaseViewHolder extends RecyclerView.ViewHolder{

        BaseViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
