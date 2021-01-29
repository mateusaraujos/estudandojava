package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

// JFrame já vem, por padrão, com o BorderLayout
public class Layout extends JFrame {

    JButton botao = new JButton("Teste");
    JButton botao2 = new JButton("Teste2");
    JButton botao3 = new JButton("Teste3");

    public Layout() {

        // setLayout(new BorderLayout()); Não é necessário, pois o JFrame já vem com BorderLayout por padrão
        
        add(BorderLayout.NORTH, botao);
        add(BorderLayout.EAST, botao2);
        add(BorderLayout.CENTER, botao3);

        setTitle("Aprendendo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout();
    }
    
}
