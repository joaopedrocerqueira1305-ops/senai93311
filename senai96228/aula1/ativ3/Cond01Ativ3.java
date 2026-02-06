import java.util.Scanner;

public class Cond01Ativ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("é positivo");
        } else if (num == 0) {
            System.out.println("é nulo");
        } else {
            System.out.println("é negativo");
        }
        sc.close();
    }
}
