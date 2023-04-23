package com.example.tamagotchi_pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tamagotchi_pet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, StartFragment.class, null)
                    .commit();
        }

    }
}