import java.util.Scanner;

public class Cond01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o nome ");
        String nome = sc.nextLine();
        
        System.out.println("informe A idade ");
        int idade = sc.nextInt();

        sc.close();
    }
}
