package com.tqky.loan.ui.home.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tqky.loan.R;
import com.tqky.loan.models.User;

import java.util.ArrayList;
import java.util.List;

public class CurrentCircleAdapter extends RecyclerView.Adapter {
    private List<User> list;

    public CurrentCircleAdapter(List<User> list) {
        this.list = list;
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_current_circle, viewGroup, false);
        return new FriendsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        User user = list.get(i);
        FriendsViewHolder holder = (FriendsViewHolder) viewHolder;
        holder.textViewFullName.setText(user.getFullName());
//        holder.textViewStatus.setText(user.getStatus());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class FriendsViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewFullName, textViewStatus;
        public ImageView imageViewAvatar;
        public FriendsViewHolder(View view) {
            super(view);
            textViewFullName = view.findViewById(R.id.textViewFullName);
            textViewStatus = view.findViewById(R.id.textViewStatus);
            imageViewAvatar = view.findViewById(R.id.imageViewAvatar);
        }
    }
}
