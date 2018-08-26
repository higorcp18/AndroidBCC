package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btnCombustivel;
    Button btnAutonomia;
    Button btnEmail;
    Button btnChaves;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAutonomia = findViewById(R.id.btnCombustivel);
        btnCombustivel = findViewById(R.id.btnAutonomia);
        btnEmail = findViewById(R.id.btnEmail);
        btnChaves = findViewById(R.id.btnChaves);

        btnChaves.setOnClickListener(this);
        btnAutonomia.setOnClickListener(this);
        btnCombustivel.setOnClickListener(this);
        btnEmail.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btnAutonomia:
                intent = new Intent(this,SegundaActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCombustivel:
                intent = new Intent(this, TerceiraActivity.class);
                startActivity(intent);
                break;
            case R.id.btnEmail:
                intent = new Intent(this,Password.class);
                startActivity(intent);
                break;
            case R.id.btnChaves:
                intent = new Intent(this, ChavesActivity.class);
                startActivity(intent);
        }
    }
}
