package com.example.tamagotchi_pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamagotchi_pet.databinding.FragmentChoiceBinding;
import com.example.tamagotchi_pet.databinding.FragmentStartBinding;

public class ChoiceFragment extends Fragment {

    FragmentChoiceBinding binding;

    public ChoiceFragment(){
        super(R.layout.fragment_choice);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChoiceBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }
}