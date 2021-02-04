package treino.basicoavancado.jogos.barata;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class JogoBarata extends JFrame {

    ImageIcon iconBarata = new ImageIcon(getClass().getResource("barata.png"));
    ImageIcon iconBarataMorta = new ImageIcon(getClass().getResource("baratamorta.png"));

    JLabel lBarata = new JLabel(iconBarata);
    JLabel lPontos = new JLabel("Pontos:");
    JLabel lContando = new JLabel("0");
    JLabel lTempo = new JLabel("Tempo:");
    JLabel lContandoTempo = new JLabel("20");
    Font fonte = new Font("Arial", Font.BOLD, 50);

    int x = (int) (Math.random() * 620);
    int y = (int) (Math.random() * 520);
    int conta = 0;
    int segundos = 20;

    public JogoBarata() {
        editarJanela();
        JOptionPane.showMessageDialog(null, "Você terá 20 segundos, OK?");
        Tempo thread = new Tempo();
        thread.start();
        matarBarata();
    }

    public class Tempo extends Thread {
        boolean feito = false;
        public void run() {
            while (true) {
                if (lContandoTempo.getText() == 0 + "") {
                    System.runFinalization();
                    feito = true;
                    return;
                } else {
                    try {Thread.sleep(1000);} catch (Exception erro) {} ;
                    --segundos;
                    lContandoTempo.setText(segundos + "");
                }
            }
        }
    }

    public void matarBarata() {

        lBarata.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lContando.setText(++conta + "");
                lBarata.setIcon(iconBarataMorta);
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                lBarata.setIcon(iconBarata);
                x = (int) (Math.random() * 620);
                y = (int) (Math.random() * 520);
                lBarata.setBounds(x, y, 321, 304);
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        while (true) {
            try { Thread.sleep(500); } catch (Exception erro) {}
            lBarata.setIcon(iconBarata);
            x = (int) (Math.random() * 620);
            y = (int) (Math.random() * 520);
            lBarata.setBounds(x, y, 321, 304);
        }
    }

    public void editarJanela() {
        setLayout(null);

        lPontos.setBounds(0, 0, 187, 50);
        add(lPontos).setFont(fonte);
        lContando.setBounds(195, 0, 100, 50);
        add(lContando).setFont(fonte);

        lTempo.setBounds(535, 0, 183, 50);
        add(lTempo).setFont(fonte);
        lContandoTempo.setBounds(725, 0, 150, 50);
        add(lContandoTempo).setFont(fonte);
        
        add(lBarata);

        setTitle("Mate a Barata");
        setSize(800, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JogoBarata();
    }

}
