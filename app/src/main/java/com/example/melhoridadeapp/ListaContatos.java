package com.example.melhoridadeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListaContatos extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private FornecedoresAdapter mAdapter;
    private RecyclerView.LayoutManager mLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        FornecedorDAO forn = new FornecedorDAO();
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayout = new LinearLayoutManager(this);
        mAdapter = new FornecedoresAdapter(forn.getFornecedores());

        mRecyclerView.setLayoutManager(mLayout);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListerner(new FornecedoresAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(ListaContatos.this, ServicoInformacao.class);
                Integer registroLista = position;
                intent.putExtra("registroLista", registroLista);
                startActivity(intent);
            }
        });
    }
}
