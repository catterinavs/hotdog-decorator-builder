package com.builder;

import com.componente.Componente;

public final class Abencoado {

    public Abencoado() {
    }

    public Componente build(HotDogBuilder builder){
        builder.addPao();
        builder.addSalsicha();
        builder.addKetchup();
        builder.addManoiese();
        builder.addMilho();
        builder.addBatataPalha();

        return builder.getHotDog();
    }
}
