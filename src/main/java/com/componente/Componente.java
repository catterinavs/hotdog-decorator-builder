package com.componente;

public abstract class Componente {
    protected String descricao;
    protected double preco;

    public Componente(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract String getDescricao();
    public abstract double getPreco();

    public abstract Componente desfazer();

    @Override
    public String toString() {
        return getDescricao() + " - R$ " + getPreco();
    }
    
}