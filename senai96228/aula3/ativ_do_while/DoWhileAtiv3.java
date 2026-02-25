package aula3.ativ_do_while;

import java.util.Scanner;

public class DoWhileAtiv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escolha uma caneta");
            System.out.println("1- Caneta Esferográfica");
            System.out.println("2- Caneta Gel");
            System.out.println("3- Caneta Tinteiro");
            System.out.println("4- Sair");
            int i = sc.nextInt();

            if (i==1) {
                System.out.println("Caneta Esferográfica: Econômica e de longa duração ");
            } else if (i==2) {
                System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave");
            } else if (i==3) {
                System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia");
            } else if (i==4) {
                System.out.print("Saindo...");
                return;
            }
        }while (true);
    }
}
