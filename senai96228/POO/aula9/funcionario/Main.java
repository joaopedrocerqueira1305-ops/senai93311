package aula9.funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("joão", 20,2000.00);
        Funcionario g1 = new Gerente("maria", 50, 2000.00, 10500.00);

        f1.exibirInfo();
        g1.exibirInfo();
    }
}
