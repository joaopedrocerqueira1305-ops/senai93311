package aula3.ativ_for;

import java.util.Scanner;

public class Ativ5_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        for(int i=1;i<=10;i++){
                System.out.println(x + " * "+i+" = "+(x*i));
            }
    }
}
