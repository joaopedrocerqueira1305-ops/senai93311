package org.example;

public class Gerente extends CargoDeConfianca {
    public Gerente(String nome, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase * super.bonificacao.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", SalarioFinal=" + this.getSalarioFinal() +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
