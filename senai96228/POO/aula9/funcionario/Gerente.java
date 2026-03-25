package aula9.funcionario;

public class Gerente extends Funcionario{
    private Double bonus;

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Gerente(String nome, int idade, Double salario, Double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Salario com bónus: R$"+(getSalario() + getBonus()));
    }

}
