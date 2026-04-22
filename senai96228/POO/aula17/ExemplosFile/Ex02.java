import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("Exemplo.txt",true);
            escritor.write("\nPrimeira linha do arquivo");
            escritor.write("\nSegunda linha do arquivo");
            escritor.close();
            System.out.println("Escrita concluida");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo");
            e.printStackTrace();
        }
    }
}
