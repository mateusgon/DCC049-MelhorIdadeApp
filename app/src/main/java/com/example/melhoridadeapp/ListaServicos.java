package com.example.melhoridadeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListaServicos extends AppCompatActivity {

    private Button construcao;
    private Button manutencao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_servicos);

        construcao = findViewById(R.id.btn_construcao);
        manutencao = findViewById(R.id.btn_manutencao);

        construcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaServicos.this, ListaContatos.class);
                startActivity(intent);
            }
        });

        manutencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaServicos.this, ListaContatos.class);
                startActivity(intent);
            }
        });
    }
}
