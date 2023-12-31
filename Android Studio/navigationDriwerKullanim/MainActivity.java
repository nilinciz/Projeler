package com.example.navigationdriwerkullanim;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.NavController;


import android.app.ActionBar;
import android.app.Notification;
import android.os.Bundle;

import com.example.navigationdriwerkullanim.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment=
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);


        NavigationUI.setupWithNavController(binding.navigationView, navHostFragment.getNavController());

        binding.toolbar.setTitle("Başlık");

        ActionBarDrawerToggle toggle=
                new ActionBarDrawerToggle(this,binding.drawer,binding.toolbar,0,0);

        binding.drawer.addDrawerListener(toggle);
        toggle.syncState();

    }
}