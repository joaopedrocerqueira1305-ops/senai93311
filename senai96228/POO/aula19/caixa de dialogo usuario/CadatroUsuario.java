public class CadatroUsuario {
    public static void main(String[] args) {
        String nome = javax.swing.JOptionPane.showInputDialog("Digite seu nome:");
        String idadeStr = javax.swing.JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(idadeStr);
        
        String mensagem = "Nome: " + nome + "\nIdade: " + idade + "\n";
        if (idade >= 18) {
            mensagem += "Você é maior de idade.";
        } else {
            mensagem += "Você é menor de idade.";
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, mensagem);
    }
}
