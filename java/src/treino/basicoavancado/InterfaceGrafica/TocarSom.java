package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

// import java.applet.Applet; Depreciados
// import java.applet.AudioClip; Depreciados
// import java.net.URL;

public class TocarSom extends JFrame {

    String caminhoMusica = "D:/Usuários/Mateus/Documentos/Projetos/estudandojava/java/src/treino/basicoavancado/InterfaceGrafica/cheer2.wav";
    String caminhoMp3 = "D:/Usuários/Mateus/Documentos/Projetos/estudandojava/java/src/treino/basicoavancado/InterfaceGrafica/latido.mp3";

    JButton tocar = new JButton("Alegria");
    Font fonte = new Font("Arial", Font.BOLD, 30);

    public TocarSom() {

        tocar.setBackground(Color.WHITE);
        tocar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tocarMusicas(caminhoMusica);
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

    /*
    public void tocarMusica(String nomeAudio) {
        // Criando um objeto da classe java.net.URL
        // Chamando a classe principal: Classe.class ou getClass()
        // getClass() não funciona se fizer em um método static
        // URL url = getClass().getResource(nomeAudio + ".wav"); Só posso executar um
        // áudio do tipo .wav
        // AudioClip audio = Applet.newAudioClip(url); Depreciados
        // audio.play(); Depreciados

        String caminho = nomeAudio;

        tocarMusicas(caminho);
    }
    */

    void tocarMusicas(String musicaLocal) {
        try {
            File caminho = new File(musicaLocal); // Guarda o caminho (completo) do arquivo
            if (caminho.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho); // Pega o aquivo 
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput); // Abre o arquivo
                clip.start(); // Inicia o arquivo
                clip.loop(Clip.LOOP_CONTINUOUSLY); // Nunca para, fica em loop

                JOptionPane.showMessageDialog(null, "Presione OK para pausar");
                long clipTimePosition = clip.getMicrosecondPosition(); // Armazena a exata posição em microsegunodos de onde parou a música
                clip.stop();

                JOptionPane.showMessageDialog(null, "Clique OK para retomar");
                clip.setMicrosecondPosition(clipTimePosition); // Configura para a possição que foi guardada
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                JOptionPane.showMessageDialog(null, "Pressione OK para parar de tocar");
                clip.stop();
            } else {
                System.out.println("Não consigo achar o arquivo.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TocarSom();
    }
    
}
