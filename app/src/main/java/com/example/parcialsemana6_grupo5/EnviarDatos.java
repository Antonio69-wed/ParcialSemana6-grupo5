package com.example.parcialsemana6_grupo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EnviarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        final EditText rNombre = (EditText)findViewById(R.id.etNombre);
        Button bEnviar = (Button)findViewById(R.id.btEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dNombre = rNombre.getText().toString();

                Bundle parametro = new Bundle();
                parametro.putString("dNombre",dNombre);

                Intent paso = new Intent(MainActivity.this,RecibirDato.class);
                paso.putExtras(parametro);
                startActivity(paso);
            }
        });

    }
}