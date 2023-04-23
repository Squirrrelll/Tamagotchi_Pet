package com.example.tamagotchi_pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamagotchi_pet.databinding.FragmentMainBinding;
import com.example.tamagotchi_pet.databinding.FragmentStartBinding;

public class MainFragment extends Fragment {
    FragmentMainBinding binding;

    public MainFragment(){
        super(R.layout.fragment_start);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }
}