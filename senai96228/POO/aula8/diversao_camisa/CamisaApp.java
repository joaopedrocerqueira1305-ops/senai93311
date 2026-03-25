package aula8.diversao_camisa;

public class CamisaApp {
    public static void main(String[] args) {
        Camisa m1 = new Camisa("Branca", "P", "Tecido");
        Camisa m2 = new Camisa("Azul", "M", "Algodão");

        System.out.println("\nSua camisa é de cor "+m1.getCor()+", tamanho "+m1.getTamanho()+", tipo "+m1.getTipo());
        System.out.println("Sua camisa é de cor "+m2.getCor()+", tamanho "+m2.getTamanho()+", tipo "+m2.getTipo());
    }
}
