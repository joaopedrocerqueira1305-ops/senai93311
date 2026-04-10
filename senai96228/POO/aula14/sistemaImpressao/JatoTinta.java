package aula14.sistemaImpressao;

public class JatoTinta implements Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("\nImprimindo com Jato de Tinta: " + texto);
    }

}
