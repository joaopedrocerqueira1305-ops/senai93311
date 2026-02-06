import java.util.Scanner;

public class cond04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua idade ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é Menor de idade");
        }
        sc.close();
    }
}
