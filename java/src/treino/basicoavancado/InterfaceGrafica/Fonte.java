package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Fonte extends JFrame {

    JButton botao = new JButton("Texto");
    // Font fonte = new Font(tipoFonte, estiloFonte, tamanhoFonte);
    Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 100);

    public Fonte() {
        // Setando a fonte no botão
        botao.setFont(fonte);
        add(botao);

        setTitle("Aprendendo sobre FONTES");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fonte();
    }
    
}
