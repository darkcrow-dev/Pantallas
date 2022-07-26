package com.example.asus.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    Button Boton;
    EditText TextoEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton = (Button)findViewById(R.id.BotonMain);
        TextoEnviar = (EditText)findViewById(R.id.TextoEnviar);
        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Texto = TextoEnviar.getText().toString(); //Regresa un string
                //Paso de la actividad 1 a la 2
                Intent intent = new Intent(MainActivity.this, Pantalla2.class); //Una Intent es un objeto de acción que puedes usar para solicitar una acción de otro componente de la aplicación.
                intent.putExtra("DATO", Texto); //Pone al intent ademas de lo declarado, algo mas
                startActivity(intent); //empieza la activity
                //finish();
            }
        });
    }
}
