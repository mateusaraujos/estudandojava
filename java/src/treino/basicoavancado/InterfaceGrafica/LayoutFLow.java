package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class LayoutFLow extends JFrame {

    JButton botao = new JButton("FLOW");
    JButton botato = new JButton("BOTATO");

    public LayoutFLow() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        // Alinhamento dos componentes à esquerda
        // Qualquer componente que for adicionado a tela, seguirá as ordens do FlowLayout
        add(botao);
        add(botato);

        setTitle("Olá!");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}

    public static void main(String[] args) {
        new LayoutFLow();
    }
    
}
