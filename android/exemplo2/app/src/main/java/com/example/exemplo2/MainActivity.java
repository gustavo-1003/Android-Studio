package com.example.exemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btLimpar;
    EditText txtNome;
    Button btClique;
    TextView legenda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculando os objetos com os objetos da inteface gráfica
        txtNome = findViewById(R.id.txtNome);
        btClique = findViewById(R.id.btClique);
        legenda= findViewById(R.id.legenda);
        btLimpar= findViewById(R.id.btLimpar);

        //ação do código

        btClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                legenda.setText("Boa noite " + txtNome.getText().toString());
            }
        });
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                legenda.setText("");
            }
        });
    }
}

