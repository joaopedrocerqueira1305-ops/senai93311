package aula14.sistemaImpressao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nEscolha: ");
            System.out.println("1 - Imprimir documento");
            System.out.println("2 - Sair");
            System.out.println("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo da impressora: ");
                    System.out.println("1 - Impressora a jato de tinta");
                    System.out.println("2 - Impressora a laser");
                    System.out.println("Opção: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o texto para imprimir: ");
                    String texto = sc.nextLine();

                    if (tipo == 1) {
                        JatoTinta jt = new JatoTinta();
                        jt.imprimir(texto);

                    } else if (tipo == 2) {
                        Laser lsr = new Laser();
                        lsr.imprimir(texto);
                    } else {
                        System.err.println("Tipo de impressora inválido!");
                    }

                    break;
                case 2:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.err.println("Opção inválida!");
                    break;
            }
        }
    }
}