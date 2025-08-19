package org.example.Atividade2;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC-1234", "Vermelho", 5, 50.0, 180.0, 12.0);
        Livro l1 = new Livro("Java para Iniciantes", "João Silva", "978-3-16-148410-0", 300, 59.90);

        System.out.println("Veículo:");
        System.out.println(v1);
        System.out.println("Livro:");
        System.out.println(l1);
    }
}
