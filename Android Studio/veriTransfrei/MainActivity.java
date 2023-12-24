package com.example.veritransferi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.veritransferi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.buttonGotoB.setOnClickListener(view ->{
        Intent yeniIntent=new Intent(MainActivity.this,ActivityB.class);
        yeniIntent.putExtra("mesaj","merhaba");
                yeniIntent.putExtra("yas","20");
                yeniIntent.putExtra("boy","1.55");
               startActivity(yeniIntent);

               Kisiler kisi= new Kisiler(9999,"Ahmet",1.87);
               yeniIntent.putExtra("nesne",kisi);

            }
            );
    }
}