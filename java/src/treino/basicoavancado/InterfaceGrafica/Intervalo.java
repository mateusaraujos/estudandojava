package treino.basicoavancado.InterfaceGrafica;

import java.awt.*;
import javax.swing.*;

public class Intervalo extends JFrame {

    Font fonte = new Font("Arial", Font.BOLD, 150);
    JLabel numero = new JLabel("0");

    Intervalo() {
        numero.setHorizontalAlignment(SwingConstants.CENTER);
        add(numero).setFont(fonte);

        setTitle("Contagem Regressiva");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void contagem() {
        int n = 120;
        while (n >= 0) { // (true) Looping infinito
            numero.setText(n + "");
            n--;
            try {
                Thread.sleep(1000);
            } catch (Exception erro) {}
        }
    }

    public static void main(String[] args) {

        /*(try {
            Thread.sleep(10000); // Milésimos, o método sleep lança um erro, então tem que ser tratado com o try/catch
        } catch (Exception erro) {})*/

        Intervalo obj = new Intervalo();
        obj.contagem();
    }
    
}
