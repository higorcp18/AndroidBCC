package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SegundaActivity extends Activity implements View.OnClickListener{

    EditText precoAlcool;
    EditText precoGasolina;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        calcular = findViewById(R.id.btnCalcularPreco);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        precoAlcool = findViewById(R.id.precoAlcool);
        precoGasolina = findViewById(R.id.precoGasolina);

        Double valorAlcoolReais = Double.parseDouble(precoAlcool.getText().toString());
        Double valorGasolinaReais = Double.parseDouble(precoGasolina.getText().toString());

        if( valorAlcoolReais / valorGasolinaReais < 0.7)
            Toast.makeText(this, "Gasolina é melhor!", Toast.LENGTH_SHORT).show();
        else{
            Toast.makeText(this, "Alcool é melhor!", Toast.LENGTH_SHORT).show();
        }
    }
}
