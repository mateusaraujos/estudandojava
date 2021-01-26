package calculadora;

import java.awt.BorderLayout;

import javax.swing.*;

public class Calc extends JFrame {

    public Calc() throws Exception {
        // setTitle("Calculadora");
        super("Calculadora");

        // L&F
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        setSize(400, 400); //l, a
        setLocation(800, 100);

        setLayout(new BorderLayout());

        PainelTexto painelTexto = new PainelTexto();
        add(BorderLayout.NORTH, painelTexto);

        JPanel painelDigitos = new JPanel();
        painelDigitos.setLayout(new BorderLayout());
        painelDigitos.add(BorderLayout.CENTER, new PainelNumeros(painelTexto.getTxtNumber()));

        painelDigitos.add(BorderLayout.EAST, new PainelOperacoes(painelTexto.getTxtNumber()));

        add(BorderLayout.CENTER, painelDigitos);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception { // Lançar as Exceções para fora
        new Calc();
    }
    
}
