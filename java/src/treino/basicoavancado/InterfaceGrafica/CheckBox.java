package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JFrame {

    JCheckBox teste = new JCheckBox("Agora", true); // JCheckBox("Agora", true) Vai aparecer com "Agora" e marcada

    public CheckBox() {
        setLayout(new FlowLayout());

        System.out.println(teste.isSelected()); // Testa se está marcada
        add(teste);

        setTitle("Mateus");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBox();
    }
    
}
