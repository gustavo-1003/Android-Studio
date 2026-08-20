package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtN1,txtN2,txtRes;
    Button btAdicionar,btSubtrair,btMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtRes = findViewById(R.id.txtRes);
        btAdicionar = findViewById(R.id.btAdicionar);
        btSubtrair = findViewById(R.id.btSubtrair);
        btMultiplicar = findViewById(R.id.btMultiplicar);

        btAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2, res = 0;
                n1 = Integer.parseInt(txtN1.getText().toString());
                n2 =Integer.parseInt(txtN2.getText().toString());
                res = n1 + n2;
                txtRes.setText(""+res);
            }
        });
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2, res = 0;
                n1 = Integer.parseInt(txtN1.getText().toString());
                n2 =Integer.parseInt(txtN2.getText().toString());
                res = n1 - n2;
                txtRes.setText(""+res);
            }
        });
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2, res = 0;
                n1 = Integer.parseInt(txtN1.getText().toString());
                n2 =Integer.parseInt(txtN2.getText().toString());
                res = n1 * n2;
                txtRes.setText(""+res);
            }
        });
    }
}