package com.example.tamagotchi_pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamagotchi_pet.databinding.FragmentGameBinding;
import com.example.tamagotchi_pet.databinding.FragmentStartBinding;

public class GameFragment extends Fragment {
    FragmentGameBinding binding;

    public GameFragment(){
        super(R.layout.fragment_game);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGameBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }
}