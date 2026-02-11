import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        while (!nome.equalsIgnoreCase("Anderson")) {
            System.out.println("Digite o nome do professor mais fofo do senai: ");
            nome = sc.next();
        }
    }
}
