package com.complementos;

import com.componente.Componente;
import com.decorator.Decorator;

public class Complemento extends Decorator{

    Complemento(String descricao, double preco) {
        super(null, descricao, preco);
    }

    public Complemento(Componente elementoDecorado, String descricao, double preco) {
        super(elementoDecorado, descricao, preco);
    }

    @Override
    public String getDescricao() {
        if(elementoDecorado == null) return descricao;
        return this.elementoDecorado.getDescricao() + ", " + descricao;
    }

    @Override
    public double getPreco() {
        if (elementoDecorado == null) return preco;
        return this.elementoDecorado.getPreco() + preco;
    }

    @Override
    public Componente desfazer() {
        return elementoDecorado;
    }
    
}
