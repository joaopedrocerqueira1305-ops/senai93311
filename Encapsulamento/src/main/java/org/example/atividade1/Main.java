package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Livro p1 = new Livro();
        Livro p2 = new Livro();

        p1.setTitulo("Java para Iniciantes");
        p1.setAutor("João Silva");
        p1.setNumPaginas(300);
        p1.setPreco(49.90);

        p2.setTitulo("harry Potter e a Pedra Filosofal");
        p2.setAutor("J.K. Rowling");
        p2.setNumPaginas(350);
        p2.setPreco(39.90);

        for (int i = 0; i < 2; i++) {
            System.out.println("Livro " + (i + 1) + ":");
            System.out.println("Título: " + (i == 0 ? p1.getTitulo() : p2.getTitulo()));
            System.out.println("Autor: " + (i == 0 ? p1.getAutor() : p2.getAutor()));
            System.out.println("Número de Páginas: " + (i == 0 ? p1.getNumPaginas() : p2.getNumPaginas()));
            System.out.println("Preço: " + (i == 0 ? p1.getPreco() : p2.getPreco()));
            System.out.println();
        }
    }
}