package com.example.tamagotchi_pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamagotchi_pet.databinding.FragmentStartBinding;

public class StartFragment extends Fragment {

    FragmentStartBinding binding;

    public StartFragment(){
        super(R.layout.fragment_start);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStartBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }
}