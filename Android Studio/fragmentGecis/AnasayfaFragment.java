package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.buttonBasla.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.ilk);

        });
        return tasarim.getRoot();
    }
}