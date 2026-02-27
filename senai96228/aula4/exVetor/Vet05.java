public class Vet05 {
    public static void main(String[] args) {
        String[] nomes ={"Anderson","carlos","Vanessa"};

        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
        nomes[2]="carla";

        for(String n : nomes) {
            System.out.println(n);
        }
    }
}