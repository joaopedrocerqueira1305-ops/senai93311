import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("digíte qual ação deseja realizar: ");
            System.out.println(" 1 - Soma,subtração,divisão e multiplicação");
            System.out.println(" 2 - média aritimética de dois números");
            System.out.println(" 3 - média aritimética de TRÊS números");
            System.out.println(" 4 - Trabalho realizado por uma força que atua sobre um objeto");
            System.out.println(" 5 - IMC de um indiíduo");
            System.out.println(" 6 - Sair");

            int opcao = sc.nextInt();


            sc.close();
        }
        
    }
}
