package com.example.melhoridadeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ServicoInformacao extends AppCompatActivity {

    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servico_informacao);

        final Bundle extras = getIntent().getExtras();
        Integer registro = extras.getInt("registroLista");

        FornecedorDAO forn = new FornecedorDAO();
        Fornecedor fornecedor = forn.getFornecedores().get(registro);

        txt1 = findViewById(R.id.textView3);
        txt2 = findViewById(R.id.textView6);
        txt3 = findViewById(R.id.textView4);
        txt4 = findViewById(R.id.textView5);
        image = findViewById(R.id.imageView2);

        txt1.setText("Nome: " +fornecedor.getmText1());
        txt2.setText("Serviço: " + fornecedor.getmText2());
        txt3.setText("Contato: " + fornecedor.getContato());
        txt4.setText("Descrição: " + fornecedor.getDescricao());
        image.setImageResource(fornecedor.getmImageResource());
    }
}
