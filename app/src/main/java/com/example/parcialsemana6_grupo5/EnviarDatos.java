package com.example.parcialsemana6_grupo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnviarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        // Crear objetos que enlazan con los componentes
        final EditText tNombre = (EditText)this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText)this.findViewById(R.id.etApellido);
        Button bDatos = (Button)this.findViewById(R.id.btEnviarDatos);

// Crear el método Clic para el botón
        bDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
// Crear las variables que reciben los datos
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();

// Primera salida utilizando Toast
                Toast.makeText(getApplicationContext(),"Tu nombre es: "+nom+" "+ape,Toast.LENGTH_LONG).show();
            }
        });
    }
}