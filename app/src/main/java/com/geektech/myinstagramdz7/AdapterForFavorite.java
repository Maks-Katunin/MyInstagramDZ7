package com.geektech.myinstagramdz7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.myinstagramdz7.ModelForFragment.ModelForFavorite;
import com.geektech.myinstagramdz7.databinding.RecyclerFavoriteItemBinding;

import java.util.ArrayList;

public class AdapterForFavorite extends RecyclerView.Adapter<AdapterForFavorite.ViewHolder> {

    //2 binding специально  для recycler_favorite_item
    private RecyclerFavoriteItemBinding binding;
    //4
    private ArrayList<ModelForFavorite> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //2 binding специально  для recycler_favorite_item
        binding = RecyclerFavoriteItemBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //5
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        //6
        return list.size();
    }

    //7
    public void addItems(ArrayList<ModelForFavorite> data) {
        this.list.addAll(data);
        notifyDataSetChanged();

    }

    //1
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        //3
        public void onBind(ModelForFavorite model) {
            binding.ivOval.setImageResource(model.getOval());
            binding.ivLiked.setImageResource(model.getLiked());
            binding.ivPhoto.setImageResource(model.getPhoto());
        }
    }
}
