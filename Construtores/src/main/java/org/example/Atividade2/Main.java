package org.example.Atividade2;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC-1234", "Vermelho", 5, 50.0, 180.0, 12.0);
        Livro l1 = new Livro("Java para Iniciantes", "João Silva", "978-3-16-148410-0", 300, 59.90);
        Cliente c1 = new Cliente("Maria", 30, "123.456.789-11", "Rua A, 123", 987654321);

        System.out.println("Veículo:");
        System.out.println(v1);
        System.out.println("Livro:");
        System.out.println(l1);
        System.out.println("Cliente:");
        System.out.println(c1);
    }
}
