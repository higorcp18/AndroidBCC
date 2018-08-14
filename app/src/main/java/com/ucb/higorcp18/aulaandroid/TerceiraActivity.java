package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TerceiraActivity extends Activity implements View.OnClickListener{

    EditText edtQtdKm;
    EditText edtQtdCombustivel;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        btnCalcular = findViewById(R.id.btnCalcularConsumo);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        edtQtdKm = findViewById(R.id.qtdKm);
        edtQtdCombustivel = findViewById(R.id.qtdTanque);

        Double qtdKm = Double.parseDouble(edtQtdKm.getText().toString());
        Double qtdCombustivel = Double.parseDouble(edtQtdCombustivel.getText().toString());

        Toast.makeText(this, "Autonomia do carro é: "+ qtdKm/qtdCombustivel,Toast.LENGTH_SHORT).show();

    }
}
