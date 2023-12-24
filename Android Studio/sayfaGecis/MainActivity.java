package com.example.kurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kurs.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;


    private Button ikincisayfayagit;

    // private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ikincisayfayagit=findViewById(R.id.ikincisayfayagit);
        ikincisayfayagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(MainActivity.this,YeniActivity.class);
                startActivity(yeniIntent);
            }
        });



        //tasarim= ActivityMainBinding.inflate(getLayoutInflater());

        //setContentView(tasarim.getRoot());

        //tasarim.button.setOnClickListener(view -> {
        // Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show();
        // });

        // button = findViewById(R.id.button);
        // textView =findViewById(R.id.textView);

        //  button.setOnClickListener(new View.OnClickListener() {
            //  @Override
                    //   public void onClick(View v) {
                    //     textView.setText("Butona tıkladınız.");
            //       Log.e("Mesaj","MERHABA");

        //   }
    //     });


    }
}