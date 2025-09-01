package org.example.ativ1;

public class Main {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa("Nike", "Azul", "M", 150.0);
        Calca calca1 = new Calca("Adidas", "Preto", "42", 200.0);
        Sapato sapato1 = new Sapato("Puma", "Branco", "40", 250.0);

        System.out.println(camisa1);
        System.out.println(calca1);
        System.out.println(sapato1);
    }
}