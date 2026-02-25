package aula3.ativ_for;

import java.util.Scanner;

public class Ativ6_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar contagem regressiva");
            System.out.println("0 - Sair");
            int opcao =sc.nextInt();

            if (opcao==1) {
                System.out.println("Digite um número: ");
                int x = sc.nextInt();
                for(int i=1;i<=10;i++){
                    System.out.println(x + " * "+i+" = "+(x*i));
                }
            } else if (opcao==2) {
                System.out.println("Digite um número: ");
                int x = sc.nextInt();
                for(int i=x;i>=0;i--){
                    System.out.println(i);
                }
            } else if (opcao==0) {
                System.out.println("saindo...");
                return;
            }
        }
    }
}
