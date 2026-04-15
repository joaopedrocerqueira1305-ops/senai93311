import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {

        } catch (InputMismatchException e) {
            System.out.println("Erro você deve digitár um número");

            sc.nextLine();
        } catch(IndexOutOfBoundsException e){
            System.out.println("Erro: Indice inválido");
        } catch(Exception e){
            System.out.println("Erro inesparedo "+ e.getMessage());
        }
    }
}