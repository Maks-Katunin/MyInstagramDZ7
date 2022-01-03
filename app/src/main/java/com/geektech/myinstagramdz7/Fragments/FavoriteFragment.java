package com.geektech.myinstagramdz7.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.myinstagramdz7.AdapterForFavorite;
import com.geektech.myinstagramdz7.ModelForFragment.ModelForFavorite;
import com.geektech.myinstagramdz7.R;
import com.geektech.myinstagramdz7.databinding.FragmentFavoriteBinding;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {

    //1 binding для фрагмента fragment_favorite
    private FragmentFavoriteBinding binding;

    //5  создаю лист который буду заполнять данными
    private ArrayList<ModelForFavorite> list = new ArrayList<>();

    //7  создаю новый адаптер для фрагмента
    private AdapterForFavorite adapter = new AdapterForFavorite();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //2 binding для фрагмента fragment_favorite
        binding = FragmentFavoriteBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    //3 вызываю метод в котором фрагмент уже создан  Чтобы заполнить его данными
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //4   создаю методом для заполнения листа
        createList();
        //8  метод для  заполнение адаптера
        createAdapter();
    }

    private void createAdapter() {
        //9  загружаю данные в адаптер
        adapter.addItems(list);
        //10  подключаю адаптер к ресайклер View
        binding.recyclerFavorite.setAdapter(adapter);

    }

    private void createList() {
        //6  заполняю лист данными имитируя backend
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
        list.add(new ModelForFavorite(R.drawable.oval, R.drawable.liked, R.drawable.photo));
    }
}