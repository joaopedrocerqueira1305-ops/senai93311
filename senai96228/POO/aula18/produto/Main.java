import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String caminho = "produtos.txt";
        int op=0;
        try {
            while (op!=7) {
                System.out.println("\n== Sistema de produtos ==");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Listar produto");
                System.out.println("3 - Salvar produtos em arquivo");
                System.out.println("4 - Ler produtos em arquivo");
                System.out.println("5 - Alterar produto no arquivo");
                System.out.println("6 - Remover arquivo");
                System.out.println("7 - Sair");
                System.out.print("Opsção: ");
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("\nQual produto deseja cadastrar?");
                        String nome = sc.nextLine();
                        System.out.println("\nQual o preço do produto? ");
                        double preco = sc.nextDouble();
                        sc.nextLine();

                        produtos.add(new Produto(nome, preco));
                        System.out.println("Produto adcionado com sucesso!");

                        break;
                    case 2:
                        System.out.println("Lista do prdutos: ");
                        int i=0;
                        for (Produto p : produtos) {
                            System.out.println(i+" - "+ p.toString()); ;
                            i++;
                        }

                        break;
                    case 3:
                        File arquivo = new File(caminho);
                        if (arquivo.createNewFile()) {
                            System.out.println("Arquivo criado com sucesso!");
                        }

                        escreverArquivo(caminho,produtos);

                        break;
                    case 4:
                        lerArquivo(caminho);

                        break;
                    case 5:
                        System.out.println("Dijite o número do produto que deseja alterar");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o novo produto");
                        String novoNome = sc.nextLine();

                        System.out.println("Digite o novo preço produto");
                        double novoPreco = sc.nextDouble();
                        sc.nextLine();

                        produtos.get(id).setNome(novoNome);
                        produtos.get(id).setPreco(novoPreco);

                        alterarArquivo(caminho,produtos);

                        System.out.println("Arquivo alterado!");

                        break;
                    case 6:
                        removerArquivo(caminho);
                        
                        break;
                    case 7:
                        System.out.println("Encerrando...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Erro digite corretamente");
            
        }
    }

    public static void escreverArquivo(String caminho, ArrayList<Produto> produtos){
        try {
            FileWriter write = new FileWriter(caminho,true);
            write.write(produtos.toString()+" \n ");
            write.close();
            System.out.println("Produto adicionado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: "+e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void lerArquivo(String caminho){
        try {
            File arquivo = new File(caminho);

            if (!arquivo.exists()) {
                System.out.println("Arquivo não existe");
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            String linha;

            System.out.println("Informações do arquivo: ");
            while ((linha=reader.readLine())!= null) {
                System.out.println(linha);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: "+e.getMessage());
        }
    }

    public static void alterarArquivo(String caminho, ArrayList<Produto> produtos){
        try {
            FileWriter writer = new FileWriter(caminho);
            writer.write(produtos.toString()+" \n ");
            writer.close();

            System.out.println("Arquivo alterado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao alterar: "+e.getMessage());
        }
    }

    public static void removerArquivo(String caminho){
        File arquivo = new File(caminho);
        if (arquivo.exists()) {
            if (arquivo.delete()) {
                System.out.println("Arquivo removido com sucesso!");
            } else{
                System.out.println("EEro ao remover o arquivo");
            }
        } else{
            System.out.println("Arquivo não existe");
        }
    }
}