package treino.basicoavancado.InterfaceGrafica;

import javax.swing.*;

public class Botao extends JFrame {

    // Instânica da classe JButton
    JButton botao = new JButton("Botão 1");
    JButton botao2 = new JButton("Botão 2");

    public Botao() {

        // Adicionar botões/componentes sem Layout setLayout(null)
        setLayout(null); // Não vai aparecer mais nada, porque, agora, eu tenho que definir a posição e tamnaho do componente
        // botao.setBounds(posicaoHorizontal, posicaoVertical, largura, altura);
        botao.setBounds(100, 300, 100, 60);
        // Um botão em qualquer posição e em qualquer tamanho
        botao2.setBounds(0, 0, 100, 40);

        // Vamos adicionar o Botão 1 na Janela
        // getContentPane().add(botao); Vai retornar a área da janela que eu poderia adicionar algum componente, e add o botao.
        add(botao);
        add(botao2);
    
        setTitle("Titulo");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Botao();
    }
    
}
