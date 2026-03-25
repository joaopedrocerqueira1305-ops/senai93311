package aula9.funcionario;

public class Funcionario {
    private String nome;
    private int idade;
    private Double salario;

    public Funcionario(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirInfo(){
        System.out.println("\nnome: "+getNome());
        System.out.println("idade: "+getIdade());
        System.out.println("salário: R$"+getSalario());
    }
}
