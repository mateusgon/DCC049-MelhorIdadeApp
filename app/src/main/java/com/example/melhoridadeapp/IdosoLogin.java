package com.example.melhoridadeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IdosoLogin extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idoso_login);

        btnLogin = findViewById(R.id.btn_fazerLoginIdoso);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(IdosoLogin.this, ListaServicos.class);
                startActivity(intent);
            }
        });
    }
}
