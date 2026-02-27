import java.util.Scanner;

public class VetorAtiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carros = new String[10];

        while (true) {
            System.out.println("\n Escolha uma opção:");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar carro");
            System.out.println("3 - Alterar carro");
            System.out.println("4 - Remover carro");
            System.out.println("5 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 5) {
                System.out.println("Saindo...");
                break;

            } else if (opcao == 1) {
                for (int i=0; i< carros.length; i++) {
                    System.out.println("Digite um nome: ");
                    carros[i] = sc.nextLine();
                }
                
                System.out.println("carros cadastrados com sucesso \n");

            } else if(opcao == 2) {
                for(int i=0;i<carros.length;i++){
                    System.out.println(i+ " - "+ carros[i]);
                }

            } else if (opcao == 3) {
                System.out.print("\nDigite a posição que deseja alterar: ");
                int posicao = sc.nextInt();
                sc.nextLine();

                // validar posição
                if (posicao >= 0 && posicao < carros.length) {

                    System.out.print("Digite o novo carro: ");
                    carros[posicao] = sc.nextLine();

                    System.out.println("\nArray após alteração:");
                    for (String carro : carros) {
                        System.out.println(carro);
                    }

                } else {
                    System.out.println("Posição inválida!");
                }

            }else if (opcao == 4) {
                System.out.print("\nDigite a posição para remover: ");
                int posRemover = sc.nextInt();

                if (posRemover >= 0 && posRemover < carros.length) {
                    // deslocar elementos
                    for (int i = posRemover; i < carros.length - 1; i++) {
                        carros[i] = carros[i + 1];
                    }

                    carros[carros.length - 1] = null;
                } else {
                    System.out.println("Posição inválida!");
                }

                System.out.println("\nLista após remoção:");
                for (String carro : carros) {
                        System.out.println(carro);
                }
            }
        }
        sc.close();
    }
}
