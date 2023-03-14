package com.example.maqmovilux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AsociarCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asociar_cuenta);


        Button guardar = findViewById(R.id.login2);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AsociarCuenta.this, Activities.class);
                startActivity(i);
            }
        });


        Button volver = findViewById(R.id.login);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AsociarCuenta.this, Activities.class);
                startActivity(i);
            }
        });


    }
}