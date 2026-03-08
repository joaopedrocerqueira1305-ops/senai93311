import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] estoque = new int[50];

        int qtd = 0;
        int opcao;

        while (true) {
            System.out.println("\n== Selecione um ação ==");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produtos (por nome)");
            System.out.println("4 - Alterar produtos (por nome)");
            System.out.println("5 - Remover produtos (por nome)");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1: 
                    if (qtd == nomes.length) {
                        System.out.println("Lista cheia! Não é possível cadastrar.");
                        break;
                    }

                    System.out.print("Digite o nome do produto: ");
                    nomes[qtd] = sc.nextLine();

                    System.out.print("Digite a quantidae em estoque: ");
                    estoque[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2: // LISTAR
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastro.");
                        break;
                    }

                    System.out.println("\n Produtos cadastrados:");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println(i + " - " + nomes[i] + " - " + estoque[i] + " em estoque");
                    }
                    break;

                case 3: // PESQUISAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();

                    int posBusca = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(busca)) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca == -1) {
                        System.out.println("Produto não encontrada.");
                    } else {
                        System.out.println("Encontrado: " + nomes[posBusca] + " - " + estoque[posBusca] + " em estoque");
                    }
                    break;

                case 4: // ALTERAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlt = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlt = i;
                            break;
                        }
                    }

                    if (posAlt == -1) {
                        System.out.println("Produto não encontrada.");
                    } else {
                        System.out.print("Novo produto: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova quantidade em estoque: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();

                        nomes[posAlt] = novoNome;
                        estoque[posAlt] = novaIdade;

                        System.out.println("Alterado com sucesso!");
                    }
                    break;

                case 5: // REMOVER (DESLOCANDO)
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = sc.nextLine();

                    int posRem = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            posRem = i;
                            break;
                        }
                    }

                    if (posRem == -1) {
                        System.out.println("Produto não encontrada.");
                    } else {
                        // desloca para a esquerda para não deixar buraco
                        for (int i = posRem; i < qtd - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            estoque[i] = estoque[i + 1];
                        }

                        // limpa última posição
                        nomes[qtd - 1] = null;
                        estoque[qtd - 1] = 0;

                        qtd--;
                        System.out.println("Produto removido com sucesso!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}