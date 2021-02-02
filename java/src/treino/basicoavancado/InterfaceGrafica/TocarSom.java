package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// import java.applet.Applet; Depreciados
// import java.applet.AudioClip; Depreciados
// import java.net.URL;

public class TocarSom extends JFrame {

    JButton tocar = new JButton("Alegria");
    Font fonte = new Font("Arial", Font.BOLD, 30);

    public TocarSom() {

        tocar.setBackground(Color.WHITE);
        tocar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("cheer2.wav");
            }
        });
        add(tocar).setFont(fonte);

        setTitle("Som");
        setSize(215, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void play(String nomeAudio) {
        // Criando um objeto da classe java.net.URL
        // Chamando a classe principal: Classe.class ou getClass()
        // getClass() não funciona se fizer em um método static
        // URL url = getClass().getResource(nomeAudio + ".wav"); Só posso executar um
        // áudio do tipo .wav
        // AudioClip audio = Applet.newAudioClip(url); Depreciados
        // audio.play(); Depreciados
    }

    public static void main(String[] args) {
        new TocarSom();
    }
    
}
