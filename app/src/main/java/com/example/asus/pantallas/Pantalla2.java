package com.example.asus.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    TextView Visual;
    Button Boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Visual = (TextView) findViewById(R.id.Visual);  //Texto para visualizar

        Intent intent = getIntent(); //Obtengo los datos del intent
        Bundle extras = intent.getExtras(); //los datos obtenidos se guardan en extra

        if(extras != null)
        {
            String dato = extras.getString("DATO"); //String para visualizar el dato
            Visual.setText(dato);   //Variable para poner el texto
        }

        Boton1 = (Button)findViewById(R.id.OtraPantalla);
        Boton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                        //Paso de la actividad 2 a la 3
                        Intent intent = new Intent(Pantalla2.this, Main2Activity.class); //Una Intent es un objeto de acción que puedes usar para solicitar una acción de otro componente de la aplicación.
                        intent.putExtra("OTRODATO", "OTRA PANTALLA"); //Pone al intent ademas de lo declarado, algo mas
                        startActivity(intent); //empieza la activity
                        //finish();
            }
        });
    }
}
