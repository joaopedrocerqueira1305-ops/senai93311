package Exercicio2;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private double PREMIO = 1.1;

    public Diretor(String nome, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao, double PREMIO) {
        super(nome, cpf, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
        this.PREMIO = PREMIO;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase * super.bonificacao.getValor() * PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.getSalarioFinal() +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
