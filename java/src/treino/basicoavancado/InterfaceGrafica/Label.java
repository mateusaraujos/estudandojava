package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Label extends JFrame {

    Font grande = new Font("Serif", Font.BOLD, 50);
    JLabel legenda = new JLabel("Texto");

    public Label() {
        legenda.setText("Outro Texto");
        legenda.setHorizontalAlignment(SwingConstants.CENTER);
        legenda.setFont(grande);
        add(legenda);

        setTitle("Estudando Label");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Label();
    }
    
}
