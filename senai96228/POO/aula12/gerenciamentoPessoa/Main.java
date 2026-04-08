package aula12.gerenciamentoPessoa;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op =0;

        while (op != 6) {
            System.out.println("\nCadastro de Pessoa");
            System.out.println("1) Cadastrar pessoa");
            System.out.println("2) Listar pessoas");
            System.out.println("3) Alterar pessoas");
            System.out.println("4) Remover pessoas");
            System.out.println("5) Pesquisar pessoas");
            System.out.println("6) Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\nDigíte o nome da pessoa");
                    String nome = sc.nextLine();

                    System.out.println("Digite a idade da pessoa");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite se é professor ou aluno");
                    String profissao = sc.nextLine();

                    if (profissao.equalsIgnoreCase("professor")) {
                        System.out.println("Digite a disciplina do professor");
                        String disciplina = sc.nextLine();
                        pessoas.add(new Professor(nome, idade, disciplina));

                        System.out.println("Professor cadastrado com sucesso!");

                    } else if (profissao.equalsIgnoreCase("aluno")) {
                        System.out.println("Digite a matricula do aluno");
                        int matricula = sc.nextInt();
                        sc.nextLine();

                        pessoas.add(new Aluno(nome, idade, matricula));

                        System.out.println("Aluno cadastrado com sucesso!");
                    } else{
                        System.out.println("profissao inválida, digite 'professor' ou 'aluno'");
                    }
                    break;
                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Lista vazia");
                        break;
                    }

                    System.out.println("\nLista de Pessoas");
                    for (int i=0; i<pessoas.size(); i++) {
                        System.out.print((i+1) + " - ");
                        pessoas.get(i).exibirInfo();
                    }

                    break;
                case 3:
                    System.out.println("Digíte o número da pessoa para alterar");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    if (indice>0 && indice<=pessoas.size()) {
                        Pessoa p = pessoas.get(indice-1);

                        System.out.println("informe novo nome");
                        p.setNome(sc.nextLine());

                        System.out.println("informe a nova idade");
                        p.setIdade(sc.nextInt());

                        if (p instanceof Aluno) {
                            System.out.println("Nova matrícula: ");
                            ((Aluno)p).setMatricula(sc.nextInt());
                        } else if (p instanceof Professor) {
                            System.out.println("Nova Disciplina: ");
                            ((Professor)p).setDisciplina(sc.nextLine());
                        }
                        System.out.println("Pessoa alterada com sucesso!");
                    } else {
                        System.out.println("Número inválido");
                    }
                    break;
                case 4:
                    System.out.println("Digíte o número da pessoa que deseja remover");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if ( index>0 && index<=pessoas.size()) {
                        pessoas.remove(index-1);
                        System.out.println("Pessoa removida com sucesso!");
                        
                    } else {
                        System.out.println("Número inválido");
                    }
                    break;
                case 5:
                    System.out.println("\nDigíte o nome da pessoa para pesquisar");
                    String busca = sc.nextLine();
                    boolean buscaExiste = false;

                    for (int i=0;i<pessoas.size();i++) {
                        if (pessoas.get(i).getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Esta pessoa existe e está em: ");
                            System.out.print((i+1) + " - ");
                            pessoas.get(i).exibirInfo();

                            buscaExiste = true;
                        }
                    }
                    if (!buscaExiste) {
                        System.out.println("Esta pessoa não existe ou o nome está incorreto");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}