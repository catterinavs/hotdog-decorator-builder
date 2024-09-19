package com.builder;

import com.componente.Componente;

public abstract class HotDogBuilder {
    protected Componente hotDog;

    public abstract void addPao();
    public abstract void addSalsicha();
    public abstract void addKetchup();
    public abstract void addManoiese();
    public abstract void addMilho();
    public abstract void addBatataPalha();

    public final Componente getHotDog(){
        return hotDog;
    }
}
