package com.hotdog;

import com.componente.Componente;

public class HotDog extends Componente{

    public HotDog(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public Componente desfazer() {
        return this;
    }

}
