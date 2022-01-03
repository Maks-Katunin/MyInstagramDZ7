package com.geektech.myinstagramdz7.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.myinstagramdz7.AdapterForFragment.AdapterForHome;
import com.geektech.myinstagramdz7.ModelForFragment.ModelForHome;
import com.geektech.myinstagramdz7.R;
import com.geektech.myinstagramdz7.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    //1
    private FragmentHomeBinding binding;

    //4
    private ArrayList<ModelForHome> list = new ArrayList<>();

    //9
    private AdapterForHome adapter = new AdapterForHome();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //2
        binding = FragmentHomeBinding.inflate(inflater,container, false);
        return binding.getRoot();
    }

    //3
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //5
        createList();
        //7
        createAdapter();
    }

    private void createList() {
        //6
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
        list.add(new ModelForHome("joshua_l The game in Japan was amazing and I want to share some photos", "September 19", R.drawable.rectangle));
    }

    //8
    private void createAdapter() {
        //10
        adapter.addItems(list);
        //11
        binding.lent.setAdapter(adapter);


    }
}