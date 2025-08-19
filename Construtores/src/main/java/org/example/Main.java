package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("joão", 20);

        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
    }
}