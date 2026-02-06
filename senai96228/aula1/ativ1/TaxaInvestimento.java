import java.util.Scanner;

public class TaxaInvestimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu valor monetario");
        double valor = sc.nextInt();

        if ( valor <= 5000) {
            System.out.println("Taxa Padrão (2.0%)");
        } else if (valor <= 20000) {
            System.out.println("Taxa Bronze (1.0%)");
        } else if (valor <= 50000) {
            System.out.println("Taxa Silver (0.5%)");
        } else {
            System.out.println("Taxa Isenta (0%)");
        }
    }
}
