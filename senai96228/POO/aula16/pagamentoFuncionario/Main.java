package aula16.pagamentoFuncionario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        try {
            System.out.println("Digite o nome do gerente: ");
            String nome = sc.nextLine();

            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode estar vazio");
            }

            System.out.println("Digite o salario do gerente: ");
            double salarioBase = sc.nextDouble();
            sc.nextLine();

            if (salarioBase <=0 ) {
                throw new IllegalArgumentException("Salario não pode ser menor ou igual a zero");
            }

            lista.add(new Gerente(nome, salarioBase));
            System.out.println("Gerente cadastrado com sucesso!");

            System.out.println("\nDigite o nome do vendedor: ");
            String nomeVendedor = sc.nextLine();

            if (nomeVendedor.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode estar vazio");
            }

            System.out.println("Digite o salario do vendedor: ");
            double salarioBaseVendedor = sc.nextDouble();
            sc.nextLine();

            if (salarioBaseVendedor <=0 ) {
                throw new IllegalArgumentException("Salario não pode ser menor ou igual a zero");
            }

            lista.add(new Vendedor(nomeVendedor, salarioBaseVendedor));
            System.out.println("Vendedor cadastrado com sucesso!");

            for (Funcionario f : lista) {
                f.exibir();
                f.calcularSalarioFinal();
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite o salario corretamente");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
}