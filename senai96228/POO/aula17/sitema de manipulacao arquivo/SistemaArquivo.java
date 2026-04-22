import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SistemaArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caminho = "arquivo.txt";
        int op;

        do{
            System.out.println("\n---MENU---");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Escrever arquivo");
            System.out.println("3 - Ler arquivo");
            System.out.println("4 - Alterar arquivo");
            System.out.println("5 - Remover arquivo");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    criarArquivo(caminho);

                    break;
                case 2:
                    System.out.println("Digíte o texto");
                    String texto = sc.nextLine();
                    escreverArquivo(caminho,texto);

                    break;
                case 3:
                    lerArquivo(caminho);

                    break;
                case 4:
                    System.out.println("Digite o novo conteúdo");
                    String novoTexto = sc.nextLine();
                    alterarArquivo(caminho,novoTexto);

                    break;
                case 5:
                    removerArquivo(caminho);

                    break;
                case 6:
                    System.out.println("Encerrando");
                    return;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(op!=6);

        sc.close();
    }

    public static void criarArquivo(String caminho){
        try{
            File arquivo = new File(caminho);

            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else{
                System.out.println("Arquivo ja existe");
            }
        } catch(IOException e){
            System.out.println("Erro ao criar o arquivo: "+e.getMessage());
        }
    }

    public static void escreverArquivo(String caminho, String texto){
        try {
            FileWriter write = new FileWriter(caminho,true);
            write.write(texto+" \n ");
            write.close();
            System.out.println("Texto adicionado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: "+e.getMessage());
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

            System.out.println("Informções do arquivo: ");
            while ((linha=reader.readLine())!= null) {
                System.out.println(linha);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: "+e.getMessage());
        }
    }

    public static void alterarArquivo(String caminho, String texto){
        try {
            FileWriter writer = new FileWriter(caminho);
            writer.write(texto);
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