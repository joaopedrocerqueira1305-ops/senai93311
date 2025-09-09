package org.example;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", Sexo.MASCULINO, 4000.0, "01/01/1990", "01/01/2020", "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", Sexo.FEMININO, 8000.0, "02/02/1985", "02/02/2015", Bonificacao.GERENTE);
        Diretor diretor = new Diretor("Carlos", "111.222.333-44", Sexo.MASCULINO, 15000.0, "03/03/1980", "03/03/2010", Bonificacao.DIRETOR, 2000.0);

        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);
        diretor.admitir(motoboy);
        diretor.demitir(gerente);
    }
}
