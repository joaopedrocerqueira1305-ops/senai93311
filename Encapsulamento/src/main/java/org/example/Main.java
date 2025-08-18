package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Produto p1 = new Produto();

        // c1.nome = "João";
        c1.setNome("João");
        c1.setIdade(30);

        p1.setNome("Caneta");
        p1.setPreco(2.50);

        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
    }
}