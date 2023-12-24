package com.example.kurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YeniActivity extends AppCompatActivity {

    private Button ucuncusayfayagit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeni);
        ucuncusayfayagit=findViewById(R.id.ucuncusayfayagit);
        ucuncusayfayagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(YeniActivity.this,Activity2.class);
                startActivity(yeniIntent);
            }
        });

    }
}