package treino.basicoavancado.InterfaceGrafica.programasoma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramaSoma extends JFrame {

    JTextField numero1 = new JTextField();
    JTextField numero2 = new JTextField();
    JLabel mais = new JLabel("+");
    JTextField resultado = new JTextField();
    JButton soma = new JButton("=");

    Font fonte = new Font("Arial", Font.BOLD, 50);

    public ProgramaSoma() {

        setLayout(new GridLayout(1, 5));

        add(numero1).setFont(fonte);

        mais.setHorizontalAlignment(SwingConstants.CENTER);
        add(mais).setFont(fonte);

        add(numero2).setFont(fonte);

        soma.setBackground(Color.WHITE);
        soma.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                long n1 = Integer.parseInt(numero1.getText());
                long n2 = Integer.parseInt(numero2.getText());
                long soma = n1 + n2;
                resultado.setText(soma + ""); // Conversão para String (soma + "")
            }
        });
        soma.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    long n1 = Integer.parseInt(numero1.getText());
                    long n2 = Integer.parseInt(numero2.getText());
                    long soma = n1 + n2;
                    resultado.setText(soma + "");
                }
            }
        });
        add(soma).setFont(fonte);

        add(resultado).setFont(fonte);

        // JANELA SET
        setTitle("Somar");
        setSize(600, 100);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        // JANELA SET
    }

    public static void main(String[] args) {
        new ProgramaSoma();
    }
    
}
