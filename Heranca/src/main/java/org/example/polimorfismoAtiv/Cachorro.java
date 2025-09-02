package org.example.polimorfismoAtiv;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Auau";
    }

    @Override
    public String comer() {
        return "O cachorro comeu a ração!!";
    }
}
