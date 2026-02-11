import java.util.Scanner;

public class Ativ2_Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma Mochila");
            System.out.println("1- Mochila Escolar");
            System.out.println("2- Mochila de Viagem");
            System.out.println("3- Mochila Esportiva");
            System.out.println("4- Sair");
            int i = sc.nextInt();

            if (i==1) {
                System.out.println("Mochila Escolar: Compacta e ideal para estudantes");
            } else if (i==2) {
                System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas");
            } else if (i==3) {
                System.out.println("Mochila Esportiva: Leve, resistente e ergonômica");
            } else if (i==4) {
                System.out.print("Saindo...");
                return;
            }
        }
    }
}
