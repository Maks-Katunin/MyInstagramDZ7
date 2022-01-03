package com.geektech.myinstagramdz7.AdapterForFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.myinstagramdz7.ModelForFragment.ModelForHome;
import com.geektech.myinstagramdz7.databinding.RecyclerHomeItemBinding;

import java.util.ArrayList;

public class AdapterForHome extends RecyclerView.Adapter<AdapterForHome.ViewHolder> {

    private ArrayList<ModelForHome> list = new ArrayList<>();
    private RecyclerHomeItemBinding binding;

    @NonNull
    @Override

    public AdapterForHome.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = RecyclerHomeItemBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForHome.ViewHolder holder, int position) {
holder.onBind(list.get(position));
    }

    public void addItems(ArrayList<ModelForHome> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerHomeItemBinding binding = RecyclerHomeItemBinding.bind(itemView);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }


        public void onBind(ModelForHome model){
        binding.tvLentTitle.setText(model.getTitle());
        binding.tvLentData.setText(model.getData());
        binding.imageLent.setImageResource(model.getImage());
        }
    }
}
