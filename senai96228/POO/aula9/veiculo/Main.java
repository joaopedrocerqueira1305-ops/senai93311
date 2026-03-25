package aula9.veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo c2 = new Carro("seila", 2005, 2);
        Carro c1 = new Carro("Fiat", 2026, 4);
        Moto m1 = new Moto("Yamaha", 2026, 1000000);

        m1.exibirInfo();
        c1.exibirInfo();
        c2.exibirInfo();
    }
}
