package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame {

    JMenuBar barra = new JMenuBar();

    JMenu menu1 = new JMenu("Opções");
    JMenuItem item1 = new JMenuItem("Aquivar");
    
    JMenu menu2 = new JMenu("Sair");
    JMenuItem item2 = new JMenuItem("Exit");

    public Menu() {

        setJMenuBar(barra);

        barra.add(menu1);
        menu1.add(item1);

        barra.add(menu2);
        menu2.add(item2);
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Menu");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
    
}
