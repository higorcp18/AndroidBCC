package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChavesActivity extends Activity implements View.OnClickListener{

    EditText edtNome, edtIdade, edtEmail;
    Button btnCompartilhar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaves);

        btnCompartilhar = findViewById(R.id.btnCompartilhar);
        btnCompartilhar.setOnClickListener(this);

        edtNome = findViewById(R.id.edtNomeChaves);
        edtIdade = findViewById(R.id.edtIdadeChaves);
        edtEmail = findViewById(R.id.edtEmailChaves);
    }

    @Override
    public void onClick(View view) {

        String nome = edtNome.getText().toString();
        String idade = edtIdade.getText().toString();
        String email = edtEmail.getText().toString();


        switch (view.getId()){
            case R.id.btnCompartilhar:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, nome+"\n"+idade+"\n"+email);
                startActivity(Intent.createChooser(shareIntent, "Compartilhar arquivos por:"));
                break;
        }
    }
}
