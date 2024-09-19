package com.main;

import com.builder.Abencoado;
import com.builder.SimplesDuploBuilder;
import com.componente.Componente;

public class Main {
    public static void main(String[] args) {
        
        try {
            Abencoado abencoado = new Abencoado();
            Componente hotdog = abencoado.build(new SimplesDuploBuilder());
            System.out.println(hotdog);
        } catch (Exception e) {
            System.out.println("Erro ao montar o hotdog");
        }

    }
}