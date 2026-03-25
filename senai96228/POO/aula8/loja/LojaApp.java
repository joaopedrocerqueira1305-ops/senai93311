package aula8.loja;

import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto(null, null, 0);

        System.out.println("nome do produto: ");
        p1.setNome(sc.nextLine());
        System.out.println("preço do produto: ");
        p1.setPreco(sc.nextDouble());
        System.out.println("Quantidade do produto: ");
        p1.setQtd(sc.nextInt());

        System.out.println("\nnome: "+p1.getNome()+"\npreço: "+p1.getPreco()+"R$\nQuantidade: "+p1.getQtd());

        sc.close();
    }
}
