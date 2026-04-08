package aula13.dipositivoExemplo;

public class Televisao implements Dispositivo{
    private boolean ligada;
    private boolean desligada;

    public void ligar(){
        ligada = true;
        System.out.println("A Televisão foi ligada");
    }
    
    public void desligar(){
        desligada = true;
        System.out.println("A Televisão foi desligada");
    }

    public boolean estaLigado(){
        return ligada;
    }
    
    public boolean estaDesligado(){
        return desligada;
    }
}
