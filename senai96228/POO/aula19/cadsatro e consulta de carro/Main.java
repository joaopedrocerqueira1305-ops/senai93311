import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarros = new ArrayList<>();
        int opcao = 0;

        do {
            String menu = "--- SISTEMA DE CADASTRO DE CARROS ---\n" +
                        "1 - Cadastrar Carro\n" +
                        "2 - Listar Carros\n" +
                        "3 - Detalhar Carro\n" +
                        "4 - Alterar Carro\n" +
                        "5 - Remover Carro\n" +
                        "6 - Gravar em Arquivo\n" +
                        "7 - Sair\n\n" +
                        "Escolha uma opção:";

            try {
                String input = JOptionPane.showInputDialog(menu);
                if (input == null) break; // Se clicar em cancelar
                opcao = Integer.parseInt(input);

                switch (opcao) {
                    case 1: // Cadastrar
                        String marca = JOptionPane.showInputDialog("Marca:");
                        String modelo = JOptionPane.showInputDialog("Modelo:");
                        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
                        listaCarros.add(new Carro(marca, modelo, ano));
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                        break;

                    case 2: // Listar
                        if (listaCarros.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                        } else {
                            StringBuilder lista = new StringBuilder("--- Lista de Carros ---\n");
                            for (int i = 0; i < listaCarros.size(); i++) {
                                lista.append(i).append(" - ").append(listaCarros.get(i).getMarca())
                                    .append(" ").append(listaCarros.get(i).getModelo()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, lista.toString());
                        }
                        break;

                    case 3:
                        int idxD = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro:"));
                        JOptionPane.showMessageDialog(null, listaCarros.get(idxD).exibirDetalhes());
                        break;

                    case 4:
                        int idxA = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro que deseja alterar:"));
                        if (idxA >= 0 && idxA < listaCarros.size()) {
                            listaCarros.get(idxA).setMarca(JOptionPane.showInputDialog("Nova Marca:"));
                            listaCarros.get(idxA).setModelo(JOptionPane.showInputDialog("Novo Modelo:"));
                            listaCarros.get(idxA).setAno(Integer.parseInt(JOptionPane.showInputDialog("Novo Ano:")));
                            JOptionPane.showMessageDialog(null, "Dados atualizados!");
                        }
                        break;

                    case 5:
                        int idxR = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro a remover:"));
                        listaCarros.remove(idxR);
                        JOptionPane.showMessageDialog(null, "Carro removido!");
                        break;

                    case 6:
                        try (FileWriter arq = new FileWriter("carros.txt");
                            PrintWriter gravarArq = new PrintWriter(arq)) {
                            for (Carro c : listaCarros) {
                                gravarArq.println("Marca: " + c.getMarca() + " | Modelo: " + c.getModelo() + " | Ano: " + c.getAno());
                            }
                            JOptionPane.showMessageDialog(null, "Dados gravados em 'carros.txt' com sucesso!");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo: " + e.getMessage());
                        }
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida ou operação cancelada.");
            }

        } while (opcao != 7);
    }
}
