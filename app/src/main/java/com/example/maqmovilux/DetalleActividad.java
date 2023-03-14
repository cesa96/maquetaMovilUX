package com.example.maqmovilux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetalleActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_actividad);

        Button guardar = findViewById(R.id.login2);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalleActividad.this, Activities.class);
                startActivity(i);
            }
        });

        Button volver = findViewById(R.id.login);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalleActividad.this, Activities.class);
                startActivity(i);
            }
        });

        Button alarmas = findViewById(R.id.button5);
        alarmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalleActividad.this, Alarmas.class);
                startActivity(i);
            }
        });

    }
}