package com.example.numero;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DatePicker data;
    Button btData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.data);
        btData = findViewById(R.id.btData);
        btData.setOnClickListener(this::onClick);

    }

    @Override
    public void onClick(View view) {
        int mes = data.getMonth()+1;
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle("Atenção");
        dialogo.setMessage("Data selecionada: " + data.getDayOfMonth() + mes + '/' + data.getMonth() + '/' + data.getYear());
        dialogo.setNeutralButton("ok", null);
        dialogo.show();
    }
}