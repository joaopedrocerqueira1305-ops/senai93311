package aula14.sistemaImpressao;

public class Laser implements Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("\nImprimindo com Laser: " + texto);
    }   
}
