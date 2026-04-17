public class Carro extends Veiculo{

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    public void calcularValor(){
        System.out.println("Valor: R$ 30000,00");
    }
}
