package com.example.administrator.multirecyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    private static final String TAG = "ListAdapter";
    private List<EditorRecommendAlbums.EditorRecommendAlbumsEntity> mData;

    public ListAdapter(List<EditorRecommendAlbums.EditorRecommendAlbumsEntity> data) {
        mData = data;
    }

    @Override
    public int getCount() {
        return mData == null ? 0 :mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.subitem_vertical_home, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.img_content);
        TextView tv_title = convertView.findViewById(R.id.tv_content);
        EditorRecommendAlbums.EditorRecommendAlbumsEntity entity = mData.get(position);
        Log.d(TAG, "getView-------:" + entity.toString());

            EditorRecommendAlbums.EditorRecommendAlbumsEntity editorRecommendAlbumsEntity = (EditorRecommendAlbums.EditorRecommendAlbumsEntity) entity;
            Glide.with(parent.getContext()).load(editorRecommendAlbumsEntity.getCoverSmall()).into(imageView);
            tv_title.setText(editorRecommendAlbumsEntity.getTitle());

        return convertView;
    }
}
