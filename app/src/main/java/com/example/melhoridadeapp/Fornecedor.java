package com.example.melhoridadeapp;

public class Fornecedor {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private String contato;
    private String descricao;

    public Fornecedor() {
    }

    public Fornecedor(int mImageResource, String mText1, String mText2, String contato, String descricao) {
        this.mImageResource = mImageResource;
        this.mText1 = mText1;
        this.mText2 = mText2;
        this.contato = contato;
        this.descricao = descricao;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
