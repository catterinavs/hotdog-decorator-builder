package com.builder;

import com.complementos.Complemento;
import com.hotdog.HotDog;

public class SimplesDuploBuilder extends HotDogBuilder{

    @Override
    public void addPao() {
        hotDog = new HotDog("Pão", 0);
    }

    @Override
    public void addSalsicha() {
        hotDog = new Complemento( hotDog, "Salsicha 1", 2.0);
        hotDog = new Complemento( hotDog, "Salsicha 2", 2.0);
    }

    @Override
    public void addKetchup() {
        hotDog = new Complemento( hotDog, "Ketchup", 0.75);
    }

    @Override
    public void addManoiese() {
        hotDog = new Complemento( hotDog, "Manoiese", 0.75);
    }

    @Override
    public void addMilho() {
        hotDog = new Complemento( hotDog, "Milho 1", 0.5);
        hotDog = new Complemento( hotDog, "Milho 2", 0.5);
    }

    @Override
    public void addBatataPalha() {
        hotDog = new Complemento( hotDog, "Batata Palha 1", 0.5);
        hotDog = new Complemento( hotDog, "Batata Palha 2", 0.5);
    }
    

}
