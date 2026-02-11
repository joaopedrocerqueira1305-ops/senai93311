import java.util.Scanner;

public class operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int x = sc.nextInt();

        System.out.println("Digite outro número");
        int y = sc.nextInt();

        System.out.println(x+"+" +y+ "="+ (x+y));
        System.out.println(x+"-" +y+ "="+ (x-y));
        System.out.println(x+"*" +y+ "="+ (x*y));
        System.out.println(x+"/" +y+ "="+ (x/y));
    }
}
