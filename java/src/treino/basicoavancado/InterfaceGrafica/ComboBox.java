package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class ComboBox extends JFrame {

    // Caixa de dados/lista, aceita objetos, como wrappers
    JComboBox<String> combo = new JComboBox<String>();

    public ComboBox() {
        setLayout(new FlowLayout());

        // Adiconando Itens
        combo.addItem("Mateus");
        combo.addItem("Milene");
        // combo.setSelectedIndex(1);
        System.out.println(combo.getSelectedIndex());
        combo.setSelectedItem("Mateus");
        System.out.println(String.valueOf(combo.getSelectedItem()));
        add(combo);

        setTitle("Combo Box");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
    
}
