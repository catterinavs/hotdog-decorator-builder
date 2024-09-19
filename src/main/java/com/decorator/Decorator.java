package com.decorator;

import com.componente.Componente;

public abstract class Decorator extends Componente{
    
    protected Componente elementoDecorado;

    protected Decorator(String descricao, double preco){
        super(descricao, preco);
    }

    public Decorator(Componente elementoDecorado, String descricao, double preco) {
        super(descricao, preco);
        this.elementoDecorado = elementoDecorado;
    }

}
