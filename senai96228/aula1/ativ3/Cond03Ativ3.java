import java.util.Scanner;

public class Cond03Ativ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua idade ");
        int idade = sc.nextInt();

        if (idade >= 60) {
            System.out.println("Você é Idoso");
        } else if (idade >= 18) {
            System.out.println("Você é Adulto");
        } else if (idade >= 13){
            System.out.println("Você é adolescente");
        } else {
            System.out.println("Você é Criança");
        }
        sc.close();
    }
}
