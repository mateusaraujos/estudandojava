package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class LayoutGrid extends JFrame {

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");

    public LayoutGrid() {

        // Uma grade conforme as linhas e colunas sets
        setLayout(new GridLayout(2, 2));
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setTitle("Título");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutGrid();
    }
    
}
