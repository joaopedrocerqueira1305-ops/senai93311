package org.example.polimorfismoAtiv;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Quack";
    }

    @Override
    public String comer() {
        return "Pato comeu a ração!!";
    }
}
