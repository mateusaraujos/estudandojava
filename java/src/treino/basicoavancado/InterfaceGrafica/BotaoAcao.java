package treino.basicoavancado.InterfaceGrafica;

import java.awt.event.*;
import javax.swing.*;

public class BotaoAcao extends JFrame implements ActionListener {

    JButton botao = new JButton("Mensagem");
    JButton botao2 = new JButton("Sair");

    // método da Classe ActionListener com parâmetro Classe ActionEvent, as duas do pacote java.awt.event
    public void actionPerformed(ActionEvent e) {
        // Podemos executar qualquer código aqui dentro, quando o botão for clicado
        if (e.getSource() == botao) {
            JOptionPane.showMessageDialog(null, "Aprendendo a usar o ActionListener");
        }
        
        if (e.getSource() == botao2) {
            System.exit(0);
        }
    }

    public BotaoAcao() {

        botao.addActionListener(this);
        // O método como parâmetro, pede a classe que está tratando o evento/ação do botão, (this) referencia a própria classe.

        botao2.addActionListener(this);

        setLayout(null);
        botao.setBounds(195, 200, 100, 60);
        botao2.setBounds(295, 200, 100, 60);
        add(botao);
        add(botao2);
        // A primeira coisa a se fazer, é escolher qual a classe que vai tratar a ação do botão
        // E agora implementar a interface ActionListener na classe escolhida

        setTitle("Treinando");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BotaoAcao();
    }
    
}
