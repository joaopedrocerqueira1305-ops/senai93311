import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();

        try {
            System.out.println("Digite o modelo do carro: ");
            String modelo = sc.nextLine();

            System.out.println("Digite o ano do carro: ");
            int ano = sc.nextInt();
            sc.nextLine();

            if (ano<2000) {
                throw new IllegalArgumentException("Ano não pode ser menor que 2000");
            }

            lista.add(new Carro(modelo, ano));
            System.out.println("Carro cadastrado com sucesso!");

            System.out.println("Digite o modelo da moto: ");
            String modeloMoto = sc.nextLine();

            System.out.println("Digite o ano da moto: ");
            int anoMoto = sc.nextInt();
            sc.nextLine();

            if (anoMoto<2000) {
                throw new IllegalArgumentException("Ano não pode ser menor que 2000");
            }

            lista.add(new Moto(modeloMoto, anoMoto));
            System.out.println("Moto cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Digite um  número válido para o ano.");
        } catch(IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }
        for (Veiculo v : lista) {
            v.exibir();
            v.calcularValor();
        }

        sc.close();
    }
}
