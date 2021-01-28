package treino.basicoavancado.biblioteca;

// Caixas de diálogo gráficas
import javax.swing.JOptionPane;

public class CaixaDeDialogo {

    public static void main(String[] args) {
        // Você tem que escrever algo
        String leitura = JOptionPane.showInputDialog(null, "Qual é o seu nome?");

        // Informa algo na tela
        JOptionPane.showMessageDialog(null, "Olá, " + leitura + "! Bom te ver por aqui.", "Boas Vindas", 1);

        // Uma pergunta com sim, não ou cancelar
        int resposta = JOptionPane.showConfirmDialog(null, "Vocé é casado?", "Oi", 1);
        System.out.println(resposta);
    
    }
    
}
