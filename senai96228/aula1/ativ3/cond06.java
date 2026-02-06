import java.util.Scanner;

public class cond06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe o primeiro número ");
        double n1 = sc.nextInt();
        System.out.println("informe o segundo número ");
        double n2 = sc.nextInt();
        System.out.println("informe a oppração aritimetica");
        String op = sc.next();

        if (op.equalsIgnoreCase("+")) {
            double resultado = n1+n2;
            System.out.println(resultado);
        }else if (op.equalsIgnoreCase("-")) {
            double resultado = n1-n2;
            System.out.println(resultado);
        } else if (op.equalsIgnoreCase("*")) {
            double resultado = n1*n2;
            System.out.println(resultado);
        } else if (op.equalsIgnoreCase("/")){
            double resultado = n1/n2;
            System.out.println(resultado);
        }
        sc.close();
    }
}
