package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;

public class Imagem extends JFrame {

    ImageIcon imagem = new ImageIcon(getClass().getResource("BorderLayout.png"));
    // Para adicionar a imagem, coloco ela em uma JLabel
    JLabel label = new JLabel(imagem);

    public Imagem() {
        add(label);

        setTitle("Imagens");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Imagem();
    }
    
}
