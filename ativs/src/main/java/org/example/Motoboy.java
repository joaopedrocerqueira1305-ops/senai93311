package org.example;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(nome, cpf, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + this.getSalarioFinal() +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}
