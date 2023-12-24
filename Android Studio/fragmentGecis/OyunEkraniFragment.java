package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentAnasayfaBinding;
import com.example.myapplication.databinding.FragmentOyunEkraniBinding;

public class OyunEkraniFragment extends Fragment {
private FragmentOyunEkraniBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false);

        tasarim.buttonBitir.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.ikinci);


        });
        return tasarim.getRoot();
    }
    }
