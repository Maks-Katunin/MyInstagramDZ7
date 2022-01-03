package com.geektech.myinstagramdz7.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.geektech.myinstagramdz7.FirstFragment;
import com.geektech.myinstagramdz7.databinding.FragmentAvatarBinding;
import com.geektech.myinstagramdz7.databinding.FragmentFirstBinding;
import com.google.android.material.tabs.TabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class AvatarFragment extends Fragment {

    private FragmentAvatarBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAvatarBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

}