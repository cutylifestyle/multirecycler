package com.example.administrator.multirecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;

public class SubAdapter extends DelegateAdapter.Adapter<SubAdapter.SubViewHolder> {

    private Context mContext;
    private LayoutHelper mLayoutHelper;
    private int mCount = 0;
    private ViewGroup.LayoutParams mLayoutParams;

    public SubAdapter(Context context, LayoutHelper layoutHelper, int count) {
        this(context, layoutHelper, count, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300));
    }

    public SubAdapter(Context context, LayoutHelper layoutHelper, int count, ViewGroup.LayoutParams layoutParams) {
        mContext = context;
        mLayoutHelper = layoutHelper;
        mCount = count;
        mLayoutParams = layoutParams;
    }


    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return mLayoutHelper;
    }

    @NonNull
    @Override
    public SubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SubViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SubViewHolder subViewHolder, int i) {
        subViewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(mLayoutParams));
    }

    @Override
    public int getItemCount() {
        return mCount;
    }

    class SubViewHolder extends RecyclerView.ViewHolder{

        SubViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
