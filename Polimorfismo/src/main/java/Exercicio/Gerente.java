package Exercicio;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", SalarioFinal=" + this.obterSalarioFinal() +
                "}\n";
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * super.bonificacao.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("admitir: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("demitir: " + funcionario.toString());
    }
}
