package org.example.Atividade2;

public class Veiculo {
    private  String placa;
    private String cor;
    private int numPassageiros;
    private double CapacidadeTanque;
    private double velocidadeMaxima;
    private double consumoMedio;

    public Veiculo(String placa, String cor, int numPassageiros, double capacidadeTanque, double velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numPassageiros = numPassageiros;
        CapacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapacidadeTanque() {
        return CapacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        CapacidadeTanque = capacidadeTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numPassageiros=" + numPassageiros +
                ", CapacidadeTanque=" + CapacidadeTanque +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", consumoMedio=" + consumoMedio +
                '}';
    }
}
