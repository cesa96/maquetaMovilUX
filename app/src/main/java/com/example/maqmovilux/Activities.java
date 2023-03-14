package com.example.maqmovilux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maqmovilux.ui.login.LoginActivity;
import com.example.maqmovilux.ui.login.SignUpActivity;

public class Activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);


        Button detalle = findViewById(R.id.button4);
        detalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activities.this, DetalleActividad.class);
                startActivity(i);
            }
        });
        Button asociar = findViewById(R.id.button2);
        asociar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activities.this, AsociarCuenta.class);
                startActivity(i);
            }
        });
        Button administrar = findViewById(R.id.button3);
        administrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activities.this, AdminSolicitudes.class);
                startActivity(i);
            }
        });


    }
}