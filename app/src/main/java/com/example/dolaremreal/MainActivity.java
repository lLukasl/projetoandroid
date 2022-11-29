package com.example.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    EditText editTextCotacao, editTextQtdDolar;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCotacao = findViewById(R.id.editTextCotacao);
        editTextQtdDolar = findViewById(R.id.editTextQtdDolar);

        textResultado = findViewById(R.id.textResultado);

    }

    public void converter(View view){

        double quantDolar = Double.parseDouble(editTextQtdDolar.getText().toString());
        double valorDolar = Double.parseDouble(editTextCotacao.getText().toString());

        double valorConvertido = valorDolar * quantDolar;


        textResultado.setText("R$: " + valorConvertido);
    }





}