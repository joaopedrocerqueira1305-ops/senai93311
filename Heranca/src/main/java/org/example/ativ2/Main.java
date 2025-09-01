package org.example.ativ2;

public class Main {
    public static void main(String[] args) {
        Fisica fisica1 = new Fisica("João Silva", "11999999999", "123.456.789-00", "MG-12.345.678", "01/01/1990");
        Juridica juridica1 = new Juridica("Empresa XYZ", "1133333333", "12.345.678/0001-99", "123.456.789.000");

        System.out.println(fisica1);
        System.out.println(juridica1);
    }
}
