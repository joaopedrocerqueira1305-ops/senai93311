import java.util.Scanner;

public class GestaoReservaPassagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc=0, i=0, indice=0;
        int max_aviao=4, max_assentos=20;
        int qnt_assento = 0, aviao = 0 ;
        int[] aviaoDisponivel = new int[max_aviao];
        int[] assentosDisponivel = new int[max_assentos];
        
        String[] passageiros = new int[max_assentos]
        String nome;

        boolean aviaoCadastrado = false;
        boolean assentoCadastrado = false;
        boolean assentosEsgotado = false;

        while (opc != 6) {
            System.out.println("\n =---= Gestão de reserva de passagem =---= \n");
            System.out.println("1 - Registrar o número de cada avião");
            System.out.println("2 - Registrar o número de assentos disponiveis em cada avião");
            System.out.println("3 - Reservar passagens aéreas");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) {
                case 1:
                    for(i=0;i<max_aviao;i++){
                        System.out.print("\ninforme o número do avião "+ (i+1) +": ");
                        aviaoDisponivel[i] = sc.nextInt();
                        
                    }
                    
                    aviaoCadastrado = true;
                    System.out.println("Aviões cadastrados com sucesso!");
                break;

                case 2:
                    if (aviaoCadastrado == false){
                        System.out.println("Nenhum avião foi cadastrado , selecione a opção 1");
                        break;
                    }

                    for(i=0;i<max_aviao;i++){
                        System.out.print("\ninforme a quantidade de assentos para o aviao "+ aviaoDisponivel[i] +": ");
                        qnt_assento = sc.nextInt();

                        if (qnt_assento > max_assentos){
                            System.out.println("Não pode haver mais de 20 assentos por avião tente novamente");
                            break;
                        } else {
                            assentosDisponivel[i] = qnt_assento;
                        }
                    }
                    assentoCadastrado = true;
                    System.out.println("Assentos cadastrados com sucesso!");
                break;

                case 3:
                    if (aviaoCadastrado == false){
                        System.out.println("Nenhum avião foi cadastrado , selecione a opção 1");
                        break;
                    }

                    System.out.println("Qual o número do avião que deseja reservar");
                    aviao = sc.nextInt();
                    
                    for(i=0;i<max_aviao;i++){
                        if (aviao == aviaoDisponivel[i]){
                            if (assentosEsgotado == false) {
                                if (assentoCadastrado == true) {
                                    System.out.println("Qual o nome do passagerio");
                                    nome = sc.nextLine();


                                }else {
                                    System.out.println("Não foram cadastrados assentos para este aviao, (opção 2)");
                                    break;
                                }
                            } else {
                                System.out.println("Não há assentos disponíveis para este avião");
                            }
                        } else {
                            indice ++;
                            if(indice ==3){
                                System.out.println("Este avião não existe!");
                                break;
                            }
                        }
                    }

                break;
                case 6:
                    System.out.println("Encerrando sistema...");
            }
        }
        sc.close();
    }
}