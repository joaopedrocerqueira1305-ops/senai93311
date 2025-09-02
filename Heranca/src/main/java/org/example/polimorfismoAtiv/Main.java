package org.example.polimorfismoAtiv;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal galo = new Galo();
        Animal pato = new Pato();

        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comer());
        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());
        System.out.println(galo.emitirSom());
        System.out.println(galo.comer());
        System.out.println(pato.emitirSom());
        System.out.println(pato.comer());

    }
}
