package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class CaixaDeTexto extends JFrame {

    JTextField caixa = new JTextField(30); // Número de colunas
    JTextArea caixagrande = new JTextArea(3, 30);

    public CaixaDeTexto() {
        setLayout(new FlowLayout());

        caixa.setText("Digite algo");
        add(caixa);
        
        caixagrande.setText(caixa.getText());
        caixagrande.setEnabled(false);
        add(caixagrande);

        setTitle("Caixa de Texto");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CaixaDeTexto();
    }
    
}
