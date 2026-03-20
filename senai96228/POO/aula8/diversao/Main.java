package POO.aula8.diversao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Carro c1 = new Carro("Fiat", "modelo tal", 2026);
        //Carro c2 = new Carro("Marca insana", "modelo 2", 1990);

        //System.out.println("\nA marca do carro é "+c1.getMarca()+", o modelo é "+c1.getModelo()+" e foi fabricado em "+c1.getAnoFabricacao());
        //System.out.println("A marca do carro é "+c2.getMarca()+", o modelo é "+c2.getModelo()+" e foi fabricado em "+c2.getAnoFabricacao());
        Carro c = new Carro(null, null, 0);
        
        System.out.println("informe a marca: ");
        c.setMarca(sc.nextLine());
        System.out.println("informe o modelo: ");
        c.setModelo(sc.nextLine());
        System.out.println("informe o ano: ");
        c.setAnoFabricacao(sc.nextInt());

        System.out.println("\nA marca do carro é "+c.getMarca()+", o modelo é "+c.getModelo()+" e foi fabricado em "+c.getAnoFabricacao());

        sc.close();
    }
}