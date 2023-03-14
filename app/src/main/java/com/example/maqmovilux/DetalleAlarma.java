package com.example.maqmovilux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DetalleAlarma extends AppCompatActivity {

    String[] usuarios={"Usuario Alarma","Usuario 1","Usuario 2","Usuario 3"};
    String[] gestos={"Gesto Confirmar","Gesto 1", "Gesto 2"};
    String[] gestos2={"Gesto Posponer 5 Minutos","Gesto 1", "Gesto 2"};
    String[] tonos={"Seleccione el Tono","Tono 1","Tono 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_alarma);


        Button guardar = findViewById(R.id.login2);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalleAlarma.this, Alarmas.class);
                startActivity(i);
            }
        });


        Button volver = findViewById(R.id.login);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalleAlarma.this, Alarmas.class);
                startActivity(i);
            }
        });

        //Usuarios
        Spinner spinUsuario = (Spinner) findViewById(R.id.spinnerUser);
        spinUsuario.setOnItemSelectedListener(new UsuarioSpinnerClass());
        ArrayAdapter aaUsuarios = new ArrayAdapter(this,android.R.layout.simple_spinner_item,usuarios);
        aaUsuarios.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinUsuario.setAdapter(aaUsuarios);

        //Gestoconfirmar
        Spinner spinGestoConfirmar = (Spinner) findViewById(R.id.spinnerGestoConfirmar);
        spinGestoConfirmar.setOnItemSelectedListener(new ConfirmarSpinnerClass());
        ArrayAdapter aaGestosConfirmar = new ArrayAdapter(this,android.R.layout.simple_spinner_item,gestos);
        aaGestosConfirmar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinGestoConfirmar.setAdapter(aaGestosConfirmar);

        //GestoPosponer
        Spinner spinGestoPosponer = (Spinner) findViewById(R.id.spinnerGestoPosponer);
        spinGestoPosponer.setOnItemSelectedListener(new PosponerSpinnerClass());
        ArrayAdapter aaGestosPosponer = new ArrayAdapter(this,android.R.layout.simple_spinner_item,gestos2);
        aaGestosPosponer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinGestoPosponer.setAdapter(aaGestosPosponer);
        //Tono
        Spinner spinTono = (Spinner) findViewById(R.id.spinnerTono);
        spinTono.setOnItemSelectedListener(new TonoSpinnerClass());
        ArrayAdapter aaTono = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tonos);
        aaTono.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTono.setAdapter(aaTono);

    }


    class UsuarioSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class ConfirmarSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class PosponerSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
    class TonoSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }


}