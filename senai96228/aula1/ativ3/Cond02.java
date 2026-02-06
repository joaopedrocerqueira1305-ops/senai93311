import java.util.Scanner;

public class cond02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é ímpar");
        }
        sc.close();
    }
}