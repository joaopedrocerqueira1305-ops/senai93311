public class Moto extends Veiculo{

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    public void calcularValor(){
        System.out.println("valor: R$15000,00");
    }
}
