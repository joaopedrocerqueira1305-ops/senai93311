package aula11.exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos =  new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha");
            System.out.println("1-Cadastrar");
            System.out.println("2-Listar contatos");
            System.out.println("3-excluir contatos");
            System.out.println("4-Alterar contatos");
            System.out.println("5-Pesquisar contatos");
            System.out.println("6-Sair");
            System.out.print("|: ");
            int op  = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    System.out.println("\nDigite o nome: ");
                    String nome = sc.nextLine();
                    
                    System.out.println("informe o contato; ");
                    String numero  =sc.nextLine();
                    contatos.add(new Contato(nome, numero));

                    System.out.println("Cadastro realizado com sucesso!");
                    break;
            
                case 2:
                    System.out.println("\nContatos cadastrados");
                    for (int i=0; i<contatos.size(); i++) {
                        System.out.println((i+1) + " - "+contatos.toString());
                    }
                    break;

                case 3:
                    System.out.println("\nInforme o contato para excluir");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index>0 && index<=contatos.size()) {
                        contatos.remove(index-1);
                        System.out.println("Contato excluido com secesso");
                    } else {
                        System.out.println("Contato inválido");
                    }
                    break;
                
                case 4:
                    System.out.println("\nInforme o número para alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos>0 && pos<=contatos.size() ) {
                        System.out.println("Digite um novo nome");
                        String novoNome = sc.nextLine();
                        System.out.println("Digíte um novo número");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos-1).setNome(novoNome);
                        contatos.get(pos-1).setNumero(novoNumero);
                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 5:
                    System.out.println("\nDígite o nome para pesquisar ");
                    String busca = sc.nextLine();

                    boolean encontrado=false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: "+(i+1)+" - "+contatos.get(i));
                            encontrado =true;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Cadastro não encontrado");
                    }
                    break;

                case 6:
                    System.out.println("Saindo..");
                    sc.close();
                    return ;
                
                    default:
                        System.out.println("\nOpção inválida");
                        break;
            }
        }
    }
}
