package aula13.animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("\nO gato " + getNome() + " está miando: Miau Miau!");
    }
}
