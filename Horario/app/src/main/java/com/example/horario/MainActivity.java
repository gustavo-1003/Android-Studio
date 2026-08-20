package com.example.horario;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TimePicker;
public class MainActivity extends Activity implements OnClickListener {
    TimePicker tp;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.btMostrar);
        tp = (TimePicker) findViewById(R.id.hora);
        bt.setOnClickListener(this);
    }
    public void onClick(View arg0) {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setMessage("Hora selecionada : "
                + tp.getHour() + ":"
                + tp.getMinute());
        dialogo.setNeutralButton("OK", null);
        dialogo.setTitle("Hora");
        dialogo.show();
    }
}
