package com.example.asus.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView Visual1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Visual1 = (TextView) findViewById(R.id.VisualizacionTexto);

        Intent intent = getIntent(); //Obtengo los datos del intent
        Bundle extras = intent.getExtras(); //los datos obtenidos se guardan en extra

        if(extras != null)
        {
            String dato = extras.getString("OTRODATO");
            Visual1.setText(dato);
        }
    }
}
