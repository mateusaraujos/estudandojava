package treino.basicoavancado.jogos.barata;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class JogoBarata extends JFrame {

	// Imagens da barata viva e morta
    ImageIcon iconBarata = new ImageIcon(getClass().getResource("barata.png"));
    ImageIcon iconBarataMorta = new ImageIcon(getClass().getResource("baratamorta.png"));

    // Labels para barata, pontuação e tempo
    JLabel lBarata = new JLabel("iconBarata");
    JLabel lPontos = new JLabel("Pontos:");
    JLabel lContando = new JLabel("0");
    JLabel lTempo = new JLabel("Tempo:");
    JLabel lContandoTempo = new JLabel("20");
    
    // Font para pontuação e tempo
    Font fonte = new Font("Arial", Font.BOLD, 50);

    /* Inteiros para colocar a barata e posições aleatórias e dentro da janela,
     * assim como a conta dos pontos e a contagem regressiva em segundos */
    int x = (int) (Math.random() * 620);
    int y = (int) (Math.random() * 520);
    int conta = 0;
    int segundos = 20;
    
    /* Interruptor para ligar/desligar a aleatoriedade da posição da barata
     * (logo no início do jogo) */
    boolean feitoInfinito = false;

    /* Construtor da classe, trás os métodos de construção e edição da janela,
     * e de jogar/continuar o jogo */
    public JogoBarata() {
        editarJanela();
        continuar();
    }
    
    // Painel para jogar/continuar jogando, trás o método de matar a barata
    public void continuar() {
    	JOptionPane.showMessageDialog(null, "Você terá 20 segundos, OK?");
        feitoInfinito = false;
        Tempo thread = new Tempo();
        thread.start();
        matarBarata();
    }
    
    // Painel para escolher se quer jogar novamente ou quer sair do jogo
    public void escolha() {
    	int op = JOptionPane.showConfirmDialog(null, "Deseja continuar jogando?");
		if (op == 0) {
			conta = 0;
			lContando.setText(conta + "");
			segundos = 20;
			lContandoTempo.setText(segundos + "");
            Tempo thread = new Tempo();
            thread.start();
            feitoInfinito = false;
            while (true) {
                if (feitoInfinito) {
                    return;
                } else {
                    try { Thread.sleep(850); } catch (Exception erro) {}
                    lBarata.setIcon(iconBarata);
                    x = (int) (Math.random() * 620);
                    y = (int) (Math.random() * 520);
                    lBarata.setBounds(x, y, 321, 304);
                }
            }
		} else if (op == 1) {
			System.exit(0);
		} else {
			System.exit(0);
		}
    }

    /* Esta classe faz com que passe o tempo de 20seg simultaneamente,
     * também mostra a pontuação e desvia para o método escolha() quando acaba o jogo */
    public class Tempo extends Thread {
        boolean feito = false;
        public void run() {
            while (true) {
                if (segundos == 0) {
                	feito = true;
                	switch (conta) {
                	case 0:
                		JOptionPane.showMessageDialog(null, "Treine mais!");
                		feitoInfinito = true;
                        escolha();
                		break;
                	case 1:
                		JOptionPane.showMessageDialog(null, "Você fez 1 ponto.");
                		feitoInfinito = true;
                        escolha();
                		break;
                	default:
                		JOptionPane.showMessageDialog(null, "Parabéns, você fez " + conta + " pontos.");
                		feitoInfinito = true;
                        escolha();
                	}
                    return;
                } else {
                    try {Thread.sleep(1000);} catch (Exception erro) {} ;
                    --segundos;
                    lContandoTempo.setText(segundos + "");
                }
            }
        }
    }

    /* Método de matar a barata com o click do mouse, também faz a barata mudar
     * de lugar, a medida que o mouse entra no campo do componente/barata */
    public void matarBarata() {
    	lBarata.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	++conta;
                lContando.setText(conta + "");
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
        
    	/* Esse looping faz com que a barata fique trocando de lugar aleatoriamente
    	 * e infinitamente assim que começa, a não ser que seja feitoInfinito == true */
        while (true) {
        	if (feitoInfinito) {
        		return;
        	} else {
        		try { Thread.sleep(850); } catch (Exception erro) {}
        		lBarata.setIcon(iconBarata);
        		x = (int) (Math.random() * 620);
        		y = (int) (Math.random() * 520);
        		lBarata.setBounds(x, y, 321, 304);
        	}
        }
    }

    // Método para criar a janela, adicionar os componentes, setar o layout e as fontes
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
    
    // Método Principal - Chama o construtor da própria classe
    public static void main(String[] args) {
        new JogoBarata();
    }

}
