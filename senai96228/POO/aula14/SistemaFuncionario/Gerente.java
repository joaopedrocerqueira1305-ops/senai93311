public class Gerente extends Funcionario {

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void  calcularSalario() {
        System.out.println("Salario final: "+ (getSalarioBase() + 1000.0));
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Gerente");
    }
}