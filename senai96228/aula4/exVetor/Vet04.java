public class Vet04 {
    public static void main(String[] args) {
        String[] nomes = new String[2];

        nomes[0]="Andeson";
        nomes[1]="edivandecleide";

        for(int i=0;i<nomes.length;i++){
            System.out.println("O nome "+i+" = "+nomes[i]);
        }
        for(String n : nomes){
            System.out.println(n);
        }
    }
}
