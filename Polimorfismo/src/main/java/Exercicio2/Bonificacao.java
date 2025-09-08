package Exercicio2;

public enum Bonificacao {
    GERENTE(1.2),
    VENDEDOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
