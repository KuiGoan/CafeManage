package com.ifi.kuirrin.cafemanage.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ifi.kuirrin.cafemanage.R;

import java.util.List;

/**
 * Created by ddquy on 7/13/2017.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {

    private List<String> titles;

    public ContentAdapter(List<String> titles) {
        this.titles = titles;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tile, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String title = titles.get(position);
        holder.title.setText(title);
    }

    @Override
    public int getItemCount() {
        return titles != null ? titles.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
        }

    }
}
