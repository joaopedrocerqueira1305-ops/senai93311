package POO.aula8.Ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João Pedro", 20);
        Pessoa p2 = new Pessoa("Maria", 32);

        System.out.println("\nO nome é "+p1.getNome()+ " Sua idade é "+p1.getIdade());
        System.out.println("O nome é "+p2.getNome()+ " Sua idade é "+p2.getIdade());

        p1.setNome("Souza");

        System.out.println("\nO nome é "+p1.getNome()+ " Sua idade é "+p1.getIdade());
        System.out.println("O nome é "+p2.getNome()+ " Sua idade é "+p2.getIdade());
    }
}
