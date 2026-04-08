package aula13.dipositivoExemplo;

import java.util.Scanner;

public class DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dispositivo televisao = new Televisao();
        Dispositivo lampada = new Lampada();

        System.out.println("Você deseja ligar ou desligar a Tv?(s/n)");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            televisao.ligar();
        } else {
            televisao.desligar();
        }

        System.out.println("Você deseja ligar ou desligar a lâmpada?(s/n)");
        resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            lampada.ligar();
        } else {
            lampada.desligar();
        }
        System.out.println("\nA televisão esta ligada? "+ televisao.estaLigado());
        System.out.println("A lâmpada esta ligada? "+ lampada.estaLigado());
        System.out.println("A televisão esta Desligada? "+ televisao.estaDesligado());
        System.out.println("A lâmpada esta Desligada? "+ lampada.estaDesligado());
        sc.close();
    }
}
