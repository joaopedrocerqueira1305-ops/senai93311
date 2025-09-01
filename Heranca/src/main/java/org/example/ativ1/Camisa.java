package org.example.ativ1;

public class camisa extends Produto {
       public camisa(String marca, String cor, String tamanho, double preco) {
           super(marca, cor, tamanho, preco);

       }

    @Override
    public String toString() {
        return "camisa{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                '}';
    }
}
