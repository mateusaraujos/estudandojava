package treino.basicoavancado.jogos;

import javax.swing.*;

public class JogoAranha extends JFrame {

    public JogoAranha() {
        editarJanela();
    }

    public void editarJanela() {
        setLayout(null);
        
        setSize(800, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JogoAranha();
    }
    
}
