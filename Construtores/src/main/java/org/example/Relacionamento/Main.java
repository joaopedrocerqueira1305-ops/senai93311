package org.example.Relacionamento;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "123", "Salvador");
        Cliente cliente1 = new Cliente("João", 25, endereco1);

        System.out.println(cliente1);
    }
}
