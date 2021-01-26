package calculadora;

import javax.swing.*;

public class Calc extends JFrame {

    public Calc() throws Exception {
        // setTitle("Calculadora");
        super("Calculadora");

        // L&F
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        setSize(400, 400); //l, a
        setLocation(800, 100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception { // Lançar as Exceções para fora
        new Calc();
    }
    
}
