package treino.basicoavancado.InterfaceGrafica;

import java.awt.*;
import javax.swing.*;

public class RadioButton extends JFrame {

    JRadioButton masculino = new JRadioButton("Masculino", true);
    JRadioButton feminino = new JRadioButton("Feminino");
    // Resolver o problema de os dois serem marcados ao mesmo tempo
    ButtonGroup grupo = new ButtonGroup();

    public RadioButton() {
        setLayout(new FlowLayout());

        add(masculino);
        add(feminino);
        grupo.add(masculino);
        grupo.add(feminino);

        setTitle("Mateus");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButton();
    }
    
}
