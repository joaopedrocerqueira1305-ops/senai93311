import java.util.Scanner;

public class Cond07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe a cor");
        String cor = sc.next();

        if (cor.equalsIgnoreCase("VERDE")) {
            System.out.println("preço: 10");
        } else if (cor.equalsIgnoreCase("AZUL") ) {
            System.out.println("preço: 20");
        } else if (cor.equalsIgnoreCase("AMARELO")) {
            System.out.println("preço: 30");
        } else if (cor.equalsIgnoreCase("VERMELHO")) {
            System.out.println("preço: 40");
        }
    }
}
