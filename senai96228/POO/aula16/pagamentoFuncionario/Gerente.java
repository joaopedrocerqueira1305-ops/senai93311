package aula16.pagamentoFuncionario;

public class Gerente extends Funcionario implements Bonifcacao{

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void calcularSalarioFinal(){
        System.out.println("Salario final: "+ (getSalarioBase() + 1000));
    }
    public void calcularBonus(){
        System.out.println("Bonus de gerente: R$ 1000,00");
    }

}
