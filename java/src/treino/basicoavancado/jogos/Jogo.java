package treino.basicoavancado.jogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jogo extends JFrame {

    ImageIcon iconParede = new ImageIcon(getClass().getResource("imagem.png"));
    ImageIcon iconParado = new ImageIcon(getClass().getResource("parado.jpg"));
    ImageIcon iconMovimento = new ImageIcon(getClass().getResource("movimento.gif"));

    JLabel lParede = new JLabel(iconParede);
    JLabel lParado = new JLabel(iconParado);

    int posX = -150;
    int posY = 350;

    public Jogo() {
        editarJanela();
        editarComponentes();
        addMovimento();
    }

    public void editarComponentes() {
        lParede.setBounds(0, 0, 600, 600);
        lParado.setBounds(posX, posY, 509, 243);
    }

    public void addMovimento() {
        // Keyboard
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                lParado.setIcon(iconMovimento);
                if (e.getKeyCode() == 38) {
                    // CIMA
                    posY -= 10;
                }
                if (e.getKeyCode() == 40) {
                    // BAIXO
                    posY += 10;
                }
                if (e.getKeyCode() == 37) {
                    // ESQUERDA
                    posX -= 10;
                }
                if (e.getKeyCode() == 39) {
                    // DIREITA
                    posX += 10;
                }
                lParado.setBounds(posX, posY, 509, 243);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                lParado.setIcon(iconParado);
            }
        });
    }

    public void editarJanela() {
        setLayout(null);

        add(lParado);
        add(lParede);

        setTitle("JOGO");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jogo();
    }
    
}
