import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = 1;
    while (x >= 0) {
        System.out.println("Digite um número positivo: ");
        x = sc.nextInt();
    }
    System.out.println("Programa encerrado");
}
}
