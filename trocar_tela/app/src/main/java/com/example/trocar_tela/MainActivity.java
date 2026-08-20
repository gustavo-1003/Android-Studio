package com.example.trocar_tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt1,bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt1) {
            Intent tela1 =new Intent(this, com.example.trocar_tela.tela1.class);
            startActivity(tela1);
        }

        if (v.getId() == R.id.bt2) {
            Intent tela2 =new Intent(this, com.example.trocar_tela.tela2.class);
            startActivity(tela2);
        }
    }
}