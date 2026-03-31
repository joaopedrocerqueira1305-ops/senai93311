import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opc=0, qtdNomes=0, indice=0;
        String nomePesq;
        Boolean nomeExiste=false, cadastrado=false;
        
        while (opc != 6) {
            System.out.println("\n--- Cadastro de nomes ---");
            System.out.println("1- Cadastrar nomes");
            System.out.println("2- Listar nomes");
            System.out.println("3- Alterar nomes");
            System.out.println("4- Remover nomes");
            System.out.println("5- Pesquisar nomes");
            System.out.println("6- Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\nQuantos nomes deseja cadastrar? ");
                    qtdNomes =sc.nextInt();
                    sc.nextLine();

                    for (int i=0;i<qtdNomes;i++) {
                        System.out.print("Digite o nome "+i+": ");
                        nomes.add(sc.nextLine());
                    }

                    System.out.println("Nomes cadastrados com sucesso!");
                    cadastrado= true;

                break;
                case 2:
                    if (cadastrado==false) {
                        System.out.println("Nenhum nome foi cadastrado(opção 1)");
                        break;
                    }

                    for (int i=0;i<nomes.size();i++) {
                        System.out.println(i+"- "+nomes.get(i));
                    }
                break;
                case 3:
                    if (cadastrado==false) {
                        System.out.println("Nenhum nome foi cadastrado(opção 1)");
                        break;
                    }

                    System.out.println("\nDigite o NÚMERO do nome que deseja alterar: ");
                    indice = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite um novo nome para substituir '"+nomes.get(indice)+"'");
                    nomes.set(indice, sc.nextLine());
                    System.out.println("Nome alterado com sucesso!");

                break;
                case 4:
                    if (cadastrado==false) {
                        System.out.println("Nenhum nome foi cadastrado(opção 1)");
                        break;
                    }

                    System.out.println("\nDigite o NÚMERO do nome que deseja remover: ");
                    indice = sc.nextInt();
                    sc.nextLine();

                    nomes.remove(indice);
                    if (nomes.size() == 0) {
                        cadastrado=false;
                    }

                    System.out.println("Nome removido com sucesso!");

                break;
                case 5:
                    if (cadastrado==false) {
                        System.out.println("Nenhum nome foi cadastrado(opção 1)");
                        break;
                    }

                    System.out.println("\nDigite um nome para pesquisar: ");
                    nomePesq = sc.nextLine();
                    nomeExiste =false;

                    for (int i=0;i<nomes.size();i++) {
                        if (nomes.get(i).equalsIgnoreCase(nomePesq)) {
                            System.out.println("Este nome exite e está em: ");
                            System.out.println(i+" - "+nomes.get(i));
                            nomeExiste =true;
                        }
                    }
                    if (nomeExiste==false) {
                        System.out.println("Este nome não existe, digite a opção 1 para cadastra-lo");
                    }

                break;
                case 6:
                    System.out.println("Encerrando...");
                break;
            }
        }
        sc.close();
    }
}