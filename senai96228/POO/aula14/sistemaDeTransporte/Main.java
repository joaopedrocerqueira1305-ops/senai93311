package aula14.sistemaDeTransporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Escolha um meio de transporte:");
            System.out.println("1. Bicicleta");
            System.out.println("2. Carro");
            System.out.println("3. Sair");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    new Bicicleta().mover();
                    break;
                case 2:
                    new Carro().mover();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}