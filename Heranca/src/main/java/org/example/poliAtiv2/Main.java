package org.example.poliAtiv2;

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();
        double a = 10;
        double b = 5;
        System.out.println("Soma: " + a + " + " + b + " = " + soma.calcular(a, b));
        System.out.println("Subtração: " + a + " - " + b + " = " + subtracao.calcular(a, b));
        System.out.println("Multiplicação: " + a + " x " + b + " = " + multiplicacao.calcular(a, b));
        System.out.println("Divisão: " + a + " / " + b + " = " + divisao.calcular(a, b));

    }
}
