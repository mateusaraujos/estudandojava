package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Cores extends JFrame {

    JButton botao = new JButton("BOTÃO");
    Font fonte = new Font("Courier New", Font.PLAIN | Font.BOLD, 150);
    // Podemos criar nossas cores (int vermelho, int verde, int azul).
    Color cor = new Color(90, 2, 255);

    public Cores() {
        botao.setForeground(cor); // cor que eu criei
        botao.setBackground(Color.GRAY);
        botao.setFont(fonte);
        add(botao);

        setTitle("Hellooo");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Cores();
    }
    
}
