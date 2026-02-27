import java.util.Scanner;

public class Duplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] idades = new int[3];

        for(int i=0;i<3;i++){
            System.out.println("informe o nome: ");
            nomes[i] = sc.nextLine();

            System.out.println("informe a idade: ");
            idades[i] = sc.nextInt();
            
            sc.nextLine(); //LIMPAR BUFFER
        }

        for(int i=0;i<3;i++){
            System.out.println(nomes[i]+" Sua idade é "+idades[i]);
        }
        sc.close();
    }
}