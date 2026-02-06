import java.util.Scanner;

public class cond05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua senha ");
        String senha = sc.next();

        if (senha == "senha123" ) {
            System.out.println("Porta ABERTA");
        } else {
            System.out.println("Senha não confere ");
        }

        sc.close();
    }
}
