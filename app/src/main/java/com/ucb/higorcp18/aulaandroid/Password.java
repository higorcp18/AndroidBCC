package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Password extends Activity implements View.OnClickListener{

    Button enviar;
    EditText email;
    EditText password;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        enviar = findViewById(R.id.btnOk);
        enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        email = findViewById(R.id.edtEmail);
        password = findViewById(R.id.edtPassword);


        Usuario usuario = new Usuario();

        usuario.setEmail(email.getText().toString());
        usuario.setSenha(password.getText().toString());

        intent = new Intent(this,SecondPassword.class);

        intent.putExtra("usuario", usuario);

        //intent.putExtra("EMAIL", email.getText().toString());
        //intent.putExtra("PASSWORD", password.getText().toString());
        startActivity(intent);
    }
}
