package aula3.ativ_for;

public class Ativ3_For {
    public static void main(String[] args) {
        System.out.println("Números ímpares até 51: ");
        for(int i=1;i<=51;i++){
            if (i%2>0) {
                System.out.print(", "+i);
            }
        }
        System.out.println("Números PARES de 52 até 100: ");
        for(int i=52;i<=100;i++){
            if (i%2==0) {
                System.out.print(", "+i);
            }
        }
    }
}
