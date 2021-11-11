package com.example.widgetcoleccin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Array de elementos
        String [] elementos = {"Toledo", "Ciudad Real", "Cuenca", "Guadalajara", "Albacete"};

        // Adaptador de texto (String)
        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Lista de referencia
        ListView l = findViewById(R.id.listViewProvincias);

        //Crear adaptador
        adaptador= new ArrayAdapter<String>(this, R.layout.fila, elementos );

        //Pasamos adaptador a la lista
        l.setAdapter(adaptador);
        l.setOnItemClickListener(this);
    }


     @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         TextView t =(TextView) findViewById(R.id.textViewResultado);
         t.setText("Has elegido " + parent.getItemAtPosition(position).toString());
    }
}