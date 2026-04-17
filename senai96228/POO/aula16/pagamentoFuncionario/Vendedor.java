package aula16.pagamentoFuncionario;

public class Vendedor extends Funcionario implements Bonifcacao{

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public void calcularSalarioFinal(){
        System.out.println("Salario final: "+(getSalarioBase()+500));
    }
    public void calcularBonus(){
        System.out.println("Bonus de vendedor: R$ 500,00");
    }

}
