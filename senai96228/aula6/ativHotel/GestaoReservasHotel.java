import java.util.Scanner;

public class GestaoReservasHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max_quartos = 5;
        int max_reservas = 25;
        int qtdQuartos = 0;
        int[] numerosQuartos = new int[max_quartos];
        int[] camasDisponiveis = new int[max_reservas];
        String[] nomesHospedes = new String[max_reservas];
        int[] quartoDaReserva = new int[max_reservas];
        int totalReservas = 0;
        boolean hotelRegistrado = false;
        boolean camasRegistradas = false;
        int opc;

        do {
            System.out.println("\n +-+ Gestão de Reservas de Hotel +-+");
            System.out.println("1 - Registrar número dos Quartos");
            System.out.println("2 - Registrar quantidade de camas por Quarto");
            System.out.println("3 - Reservar Quarto");
            System.out.println("4 - Consultar reservas por Quarto");
            System.out.println("5 - Consultar reservas por Hóspede");
            System.out.println("6 - Sair do sistema");
            System.out.print("Escolha: ");

            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            opc = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opc) {
                case 1: {
                    System.out.print("Informe a quantidade de Quartos (máx. " + max_quartos + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    qtdQuartos = sc.nextInt();
                    sc.nextLine();

                    if (qtdQuartos < 1 || qtdQuartos > max_quartos) {
                        System.out.println("Quantidade inválida! Deve ser entre 1 e " + max_quartos + ".");
                        qtdQuartos = 0;
                        hotelRegistrado = false;
                        camasRegistradas = false;
                        break;
                    }

                    for (int i = 0; i < qtdQuartos; i++) {
                        System.out.print("Número do Quarto [" + (i + 1) + "]: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Digite um número válido: ");
                            sc.next();
                        }
                        numerosQuartos[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    for (int i = 0; i < max_quartos; i++) {
                        camasDisponiveis[i] = 0;
                    }

                    totalReservas = 0;
                    for (int i = 0; i < max_reservas; i++) {
                        nomesHospedes[i] = null;
                        quartoDaReserva[i] = 0;
                    }

                    hotelRegistrado = true;
                    camasRegistradas = false;
                    System.out.println("Quartos registrados com sucesso!");
                    break;
                }

                case 2: {
                    if (!hotelRegistrado) {
                        System.out.println("Nenhum quarto Registrado!\n Registre primeiro os quartos (opção 1).");
                        break;
                    }

                    for (int i = 0; i < qtdQuartos; i++) {
                        int camas;
                        while (true) {
                            System.out.print("camas disponíveis no quarto " + numerosQuartos[i] + ": ");
                            while (!sc.hasNextInt()) {
                                System.out.print("Digite um número válido: ");
                                sc.next();
                            }
                            camas = sc.nextInt();
                            sc.nextLine();

                            if (camas < 0) {
                                System.out.println("Quantidade inválida! não podem haver quantidades negativas.");
                            } else {
                                break;
                            }
                        }
                        camasDisponiveis[i] = camas;
                    }

                    camasRegistradas = true;
                    System.out.println("Camas Registradas!");
                    break;
                }

                case 3: {
                    if (!hotelRegistrado || !camasRegistradas) {
                        System.out.println("Registre os Quartos (opção 1) e camas (opção 2) antes de reservar.");
                        break;
                    }
                    if (totalReservas >= max_reservas) {
                        System.out.println("Limite máximo de " + max_reservas + " reservas atingido!");
                        break;
                    }

                    System.out.print("Informe o número do Quarto para reservar: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int numQto = sc.nextInt();
                    sc.nextLine();

                    int indice = -1;
                    for (int i = 0; i < qtdQuartos; i++) {
                        if (numerosQuartos[i] == numQto) {
                            indice = i;
                            break;
                        }
                    }

                    if (indice == -1) {
                        System.out.println("Este Quarto não existe!");
                        break;
                    }

                    if (camasDisponiveis[indice] <= 0) {
                        System.out.println("Não há camas disponíveis para este quarto!");
                        break;
                    }

                    String nome;
                    while (true) {
                        System.out.print("Nome do Hospede: ");
                        nome = sc.nextLine().trim();
                        if (nome.isEmpty()) {
                            System.out.println("Nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    // efetivar reserva
                    nomesHospedes[totalReservas] = nome;
                    quartoDaReserva[totalReservas] = numQto;
                    totalReservas++;
                    camasDisponiveis[indice]--;
                    System.out.println("Reserva realizada com sucesso!");
                    break;
                }

                case 4: {
                    if (!hotelRegistrado) {
                        System.out.println("Registre primeiro os Quartos (opção 1).");
                        break;
                    }

                    System.out.print("Informe o número do Quarto para consulta: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int consultaQrt = sc.nextInt();
                    sc.nextLine();

                    int idConsulta = -1;
                    for (int i = 0; i < qtdQuartos; i++) {
                        if (numerosQuartos[i] == consultaQrt) {
                            idConsulta = i;
                            break;
                        }
                    }

                    if (idConsulta == -1) {
                        System.out.println("Este Quarto não existe!");
                        break;
                    }

                    boolean encontrou = false;
                    System.out.println("Reservas para o Quarto " + consultaQrt + ":");
                    for (int i = 0; i < totalReservas; i++) {
                        if (quartoDaReserva[i] == consultaQrt) {
                            System.out.println("- " + nomesHospedes[i]);
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este Quarto!");
                    }

                    System.out.println("camas restantes para o Quarto " + consultaQrt + ": " + camasDisponiveis[idConsulta]);
                    break;
                }

                case 5: {
                    if (totalReservas == 0) {
                        System.out.println("Não há reservas no sistema.");
                        break;
                    }

                    String nomeConsulta;
                    while (true) {
                        System.out.print("Informe o nome do Hóspede: ");
                        nomeConsulta = sc.nextLine().trim();
                        if (nomeConsulta.isEmpty()) {
                            System.out.println("Nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    boolean achou = false;
                    System.out.println("Reservas do Hóspede \"" + nomeConsulta + "\":");
                    for (int i = 0; i < totalReservas; i++) {
                        if (nomesHospedes[i] != null && nomesHospedes[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Quarto " + quartoDaReserva[i]);
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("Não há reservas realizadas para este Hóspede!");
                    }
                    break;
                }

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 6);

        sc.close();
    }
}