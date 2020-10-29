package com.example.vistas_y_gruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class Ejercicio_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_9);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        String string = String.valueOf(spinner.getSelectedItemId());
    }
}