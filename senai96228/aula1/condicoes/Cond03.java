import java.util.Scanner;

public class Cond03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe nota 1 ");
        double nota1 = sc.nextInt();
        
        System.out.println("informe nota 2 ");
        double nota2 = sc.nextInt();

        double media = (nota1+nota2) /2;

        if (media>=7) {
            System.out.println("Aprovado");            
        } else if (media>=5) {
            System.out.println("Recuperação");            
        }else {
            System.out.println("Reprovado");            
        }
        System.out.println("Media: " + media);

        sc.close();
    }
}
