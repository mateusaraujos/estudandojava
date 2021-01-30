package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.event.*;

public class CapturarTeclado extends JFrame {

    public CapturarTeclado() {

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'M') {
                    System.out.println("Me chame de Mateus");
                }
                // Vai capturar a tecla 'M' e fazer algo
            }
        });

        setTitle("Capturando Teclado");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CapturarTeclado();
    }
    
}
