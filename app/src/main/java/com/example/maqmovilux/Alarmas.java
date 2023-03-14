package com.example.maqmovilux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alarmas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmas);


        Button agregar = findViewById(R.id.button4);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Alarmas.this, DetalleAlarma.class);
                startActivity(i);
            }
        });


        Button volver = findViewById(R.id.login4);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Alarmas.this, DetalleActividad.class);
                startActivity(i);
            }
        });

    }
}