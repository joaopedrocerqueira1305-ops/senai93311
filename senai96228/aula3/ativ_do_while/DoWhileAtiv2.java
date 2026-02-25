package aula3.ativ_do_while;

import java.util.Scanner;

public class DoWhileAtiv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escolha uma embalgem");
            System.out.println("1- caixa de papelão");
            System.out.println("2- sacola plástica");
            System.out.println("3- embalgem de vidro");
            System.out.println("4- Sair");
            int i = sc.nextInt();

            if (i==1) {
                System.out.println("Caixa de papelão: Ideal para transporte e armazenamento");
            } else if (i==2) {
                System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
            } else if (i==3) {
                System.out.println("Embalagem de vidro: Resistente e reutilizável");
            } else if (i==4) {
                System.out.print("Saindo...");
                return;
            }
        } while(true);
    }
}
