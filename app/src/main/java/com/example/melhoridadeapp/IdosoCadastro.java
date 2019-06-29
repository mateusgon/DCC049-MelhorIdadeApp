package com.example.melhoridadeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IdosoCadastro extends AppCompatActivity {

    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idoso_cadastro);
        btnCadastro = findViewById(R.id.btn_ConfirmarCadastroIdoso);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(IdosoCadastro.this, ListaServicos.class);
                startActivity(intent);
            }
        });
    }
}
