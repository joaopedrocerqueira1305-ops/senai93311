import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dados.txt");
        fw.write("Primeira linha");
        fw.write("\nSegunda linha");
        fw.close();
        System.out.println("Escrita concluída");
        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
