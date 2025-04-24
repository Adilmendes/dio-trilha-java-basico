import javax.swing.JOptionPane;

public class UsoJOptionPane {
    public static void main(String[] args) {
        // Exibe uma mensagem
        JOptionPane.showMessageDialog(null, "Bem-vindo ao programa!");

        // Pede o nome do usuário
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        if (nome != null) {
            JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
        }

        // Pede confirmação
        int resposta = JOptionPane.showConfirmDialog(null, "Você gosta de Java?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Que bom!");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena!");
        }
    }
}