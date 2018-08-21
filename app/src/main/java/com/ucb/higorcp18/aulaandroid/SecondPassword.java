package com.ucb.higorcp18.aulaandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondPassword extends Activity {

    TextView email;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_password);

        email = findViewById(R.id.lblEmail);
        password = findViewById(R.id.lblPassword);

        email.setText(getIntent().getStringExtra("EMAIL"));
        password.setText(getIntent().getStringExtra("PASSWORD"));
    }
}
