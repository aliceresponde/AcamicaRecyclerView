package com.example.alice.acamicarecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alice on 5/31/17.
 */

class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewHolder> {
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyRecyclerViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
        holder.title.setText("Title number " + position);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class MyRecyclerViewHolder extends RecyclerView.ViewHolder{
        private final TextView title;

        public MyRecyclerViewHolder(ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent ,false));
            title = (TextView) itemView.findViewById(android.R.id.text1);
        }

        public TextView getTitle() {
            return title;
        }
    }
}
