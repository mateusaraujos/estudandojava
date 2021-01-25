package treino.janelas;
// Usanod o container JFrame que representa a janela. 
// Tratamento de eventos de botão em Swing.

// A janela é representada por um objeto da classe JFrame.
import javax.swing.JFrame;

public class Janela {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Primeira Janela"); // AO LADO - Título da janela.
        f.setSize(300, 200); // AO LADO - Tamanho da janela em px (largura, altura).
        // ABAIXO - Posição na tela onde a janela será desenhada (contando do lado superior esquerdo do monitor).
        f.setLocation(500, 300);
        // ABAIXO - Como o java deve tratar o fechamento da janela. Por padrão, o java só esconde a janela, não fecha.
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ACIMA - Fazer a aplicação terminar quando eu fechar a janela com a constante EXIT_ON_CLOSE.
        // ABAIXO - Para a janela realmente ser desenhada na tela, temos que dizer que ela é visível.
        f.setVisible(true);
    }
}
