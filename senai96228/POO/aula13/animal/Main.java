package aula13.animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar um novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o tipo de animal a ser adicionado:");
                    System.out.println("1 - Cachorro");
                    System.out.println("2 - Gato");
                    System.out.print("Opção: ");
                    int tipoAnimal = sc.nextInt();
                    sc.nextLine();
                    
                    if (tipoAnimal == 1) {
                        System.out.print("Digite o nome do animal: ");
                        String nome = sc.nextLine();

                        animais.add(new Cachorro(nome));
                        System.out.println("Cachorro adicionado com sucesso!");
                    } else if (tipoAnimal == 2) {
                        System.out.print("Digite o nome do animal: ");
                        String nome = sc.nextLine();

                        animais.add(new Gato(nome));
                        System.out.println("Gato adicionado com sucesso!");
                    } else {
                        System.out.println("Opção inválida");
                    }
                    
                    break;
                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                        break;
                    }

                    System.out.println("Animais cadastrados:");
                    for (int i = 0; i < animais.size(); i++) {
                        System.out.println((i+1) + " - " + animais.get(i).getNome());
                    }
                    System.out.print("Escolha um animal para emitir som: ");
                    int escolhaAnimal = sc.nextInt();
                    sc.nextLine();

                    if (escolhaAnimal > 0 && escolhaAnimal <= animais.size()) {
                        animais.get(escolhaAnimal - 1).emitirSom();
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;


                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}