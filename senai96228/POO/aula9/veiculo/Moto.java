package aula9.veiculo;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, int ano, int cilindrada) {
        super(marca, ano);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("A moto tem "+getCilindrada()+" cilindradas");
    }
}
