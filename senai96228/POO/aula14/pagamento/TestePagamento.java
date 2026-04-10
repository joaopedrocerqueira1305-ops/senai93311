package aula14.pagamento;

import java.util.Scanner;

public class TestePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nEscolha: ");
            System.out.println("1 - testar pagamento");
            System.out.println("2 - Sair");
            System.out.println("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a forma do pagamento: ");
                    System.out.println("1 - Cartão de crédito");
                    System.out.println("2 - Pix");
                    System.out.println("Opção: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.println("Digite o valor a pagar: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        CartaoCredito cc = new CartaoCredito();
                        cc.processarPagamento(valor);

                    } else if (tipo == 2) {
                        System.out.println("Digite o valor a pagar: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        Pix pix = new Pix();
                        pix.processarPagamento(valor);

                    } else {
                        System.err.println("Tipo de pagamento inválido!");
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
