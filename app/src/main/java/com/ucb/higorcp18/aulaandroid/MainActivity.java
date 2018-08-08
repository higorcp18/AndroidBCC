package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btnHelloWorld;
    Button btnAlou;
    EditText edtAlcool;
    EditText edtGasolina;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHelloWorld = findViewById(R.id.btnHello);
        btnAlou = findViewById(R.id.btnAlou);
        btnHelloWorld.setOnClickListener(this);
        btnAlou.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
//        edtAlcool = findViewById(R.id.edtAlcool);
//        edtGasolina = findViewById(R.id.edtGasolina);
//        Double precoAlcool = Double.parseDouble(edtAlcool.getText().toString());
//        Double precoGasolina = Double.parseDouble(edtGasolina.getText().toString());
//
//        if( precoAlcool/precoGasolina < 0.7)
//            Toast.makeText(this, "Gasolina é melhor!", Toast.LENGTH_SHORT).show();
//        else{
//            Toast.makeText(this, "Alcool é melhor!", Toast.LENGTH_SHORT).show();
//        }

        switch (view.getId()) {
            case R.id.btnAlou:
                Toast.makeText(this, "Btn Alou", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHello:
                Toast.makeText(this, "Btn Hello", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
