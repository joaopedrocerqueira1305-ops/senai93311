
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Digite o nome do gerente:");
        String nomeGerente = sc.nextLine();
        System.out.println("Digite o salário base do gerente:");
        Double salarioBaseGerente = sc.nextDouble();
        sc.nextLine();
        funcionarios.add(new Gerente(nomeGerente, salarioBaseGerente));;

        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = sc.nextLine();    
        System.out.println("Digite o salário base do vendedor:");
        Double salarioBaseVendedor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a comissão do vendedor:");
        Double comissaoVendedor = sc.nextDouble();
        sc.nextLine();
        funcionarios.add(new Vendedor(nomeVendedor, salarioBaseVendedor,comissaoVendedor));

        funcionarios.get(0).exibirDados();
        funcionarios.get(0).calcularSalario();
        funcionarios.get(1).exibirDados();
        funcionarios.get(1).calcularSalario();

    }
}
