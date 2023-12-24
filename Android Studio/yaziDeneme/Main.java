package com.example.myapplication;

import android.os.Bundle;

public class Main {
    private ActivityMainBinding bndg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bndg= ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(bndg.getRoot());

        bndg.button.setOnClickListener(view -> {
           Snackbar.make(view,"merhaba yazılım", Snackbar.LENGTH_SHORT).show();

        });

}
