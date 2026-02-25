package aula3.ativ_do_while;

import java.util.Scanner;

public class DoWhileAtiv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        do{
            System.out.println("Digite sua senha");
            senha = sc.nextInt();

        } while(senha != 2024);

    sc.close();
    }
}
