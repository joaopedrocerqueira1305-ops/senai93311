package aula15.safeBank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double saldo = 0.00;

        while (true) {
            try {
                System.out.println("\n1 - Ver saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Saque");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Seu saldo é de " + saldo);
                        break;

                    case 2:
                        System.out.println("Digite um valor para depositar");
                        Double valorDepostiar = sc.nextDouble();
                        sc.nextLine();

                        if (valorDepostiar<0) {
                            throw new Exception("Erro: o valor não pode ser negativo");
                        } else {
                            saldo = saldo + valorDepostiar;
                            System.out.println("Valor depositado com sucesso");
                        }
                        break;

                    case 3:
                        System.out.println("Digite quanto deseja sacar ");
                        Double valorSaque = sc.nextDouble();
                        sc.nextLine();

                        if (valorSaque<0) {
                            throw new Exception("Erro: o valor não pode ser negativo");
                        } else if (valorSaque>saldo) {
                            throw new Exception("Erro: saldo insuficiente");
                        } else{
                            saldo = saldo - valorSaque;
                            System.out.println("Valor retirado com sucesso!");
                        }

                        break;

                    case 4:
                        System.out.println("Encerrando");
                        sc.close();
                        return;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Voce deve digitar um número");
                sc.nextLine();

            } catch (Exception e){
                System.out.println("Erro inesperado: "+ e.getMessage());
            }
        }
    }
}