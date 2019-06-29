package com.example.melhoridadeapp;

import java.util.ArrayList;

public class FornecedorDAO {
    final ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    public FornecedorDAO() {
        fornecedores.add(new Fornecedor(R.drawable.pedreiro, "João Carlos", "Pedreiro", "2422424290", "Experiência há mais de 30 anos exercendo suas funções."));
        fornecedores.add(new Fornecedor(R.drawable.pedreiro, "Pedro Jr.", "Pedreiro", "2422313160", "Responsável por obras de grande porte, responsável e cuidadoso."));
        fornecedores.add(new Fornecedor(R.drawable.pedreiro, "Fernando Nascimento", "Pedreiro", "2422356060", "Poder ter ajudar é uma das minhas paixões"));
        fornecedores.add(new Fornecedor(R.drawable.icone_bombeiro, "Wallace Mineiro", "Bombeiro hidráulico", "24987137999", "No mercado há 15 anos acabando com seus problemas hidráulicos."));
        fornecedores.add(new Fornecedor(R.drawable.icone_bombeiro, "Antonio Martins", "Bombeiro hidráulico", "2422405060", "Amo poder resolver os problemas que existem no seu lar."));
        fornecedores.add(new Fornecedor(R.drawable.icone_bombeiro, "Gabriel Rodrigues", "Bombeiro hidráulico", "2422304060", "Experiência e ótimas recomendações"));
        fornecedores.add(new Fornecedor(R.drawable.pintor, "Durval Costa", "Pintor", "24988001122", "Está com problemas de pintura, o meu serviço pode te ajudar. Qualidade garantida."));
        fornecedores.add(new Fornecedor(R.drawable.pintor, "Renê Miranda", "Pintor", "24999887766", "Experiência de 30 anos e os melhores preços. Responsabilidade em primeiro lugar."));
        fornecedores.add(new Fornecedor(R.drawable.pintor, "João Silva", "Pintor", "24981393980", "Eficiente e responsável"));
        fornecedores.add(new Fornecedor(R.drawable.esquadria, "José Cardoso", "Esquadrias", "2422105090", "Problemas com esquadrias e armações? Sempre disponível para ajudá-lo."));
        fornecedores.add(new Fornecedor(R.drawable.esquadria, "Ricardo Oliveira", "Esquadrias", "24981336611", "Trabalhando com esquadrias há mais de 30 anos, conte comigo sempre."));
        fornecedores.add(new Fornecedor(R.drawable.esquadria, "Bruno Miranda", "Esquadrias", "32988090920", "Experiência de 10 anos, posso resolver seus problemas"));
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }
}
