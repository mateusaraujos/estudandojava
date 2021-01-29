package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;

public class Janela extends JFrame {

    // Dentro do constructor
    /*(public Janela() {
        JFrame frame = new JFrame();
        frame.setTitle("Título da Janela");
        frame.setSize(500, 400); // (largura, altura) em pixels

        frame.setLocationRelativeTo(null); // A Janela aparece centralizada.

        frame.setResizable(false); // Não redimensiona
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    })*/

    public Janela() {
        setTitle("Título da Janela");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela();
    }
    
}
