package org.example.Atividade1;

public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String Alimentacao;

    public Pet(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        Alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                ", porte='" + porte + '\'' +
                ", Alimentacao='" + Alimentacao + '\'' +
                '}';
    }
}
