package org.example.Atividade1;

public class Main {
    public static void main(String[] args) {
        Pet p1 = new Pet("Rex", 5, "Labrador", "Grande", "Ração");
        Pet p2 = new Pet("Mia", 3, "Siamês", "Pequeno", "Comida úmida");

        System.out.println("Pet 1:");
        System.out.println(p1);
        System.out.println("Pet 2:");
        System.out.println(p2.toString());
    }
}
