package com.example.buttomnavkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.buttomnavkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding bndg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bndg= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bndg.getRoot());


        NavHostFragment navHostFragment=
                (NavHostFragment)  getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavigationUI.setupWithNavController(bndg.bottomNav,navHostFragment.getNavController());
    }
}