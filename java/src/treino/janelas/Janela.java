package treino.janelas;
// Usanod o container JFrame que representa a janela. 
// Tratamento de eventos de botão em Swing.

// A janela é representada por um objeto da classe JFrame.
import javax.swing.JFrame;
// ***JPanel para agrupar todos os componentes que eu criar.***
// É um componente invisível, não enxergamos se não tiver bordas.
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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

        // ABAIXO - Antes de deixar a janela visível.
        // ADICIONO O PAINEL NA JANELA/FRAME, E DEPOIS ADICIONO OS COMPONENTES DENTRO DO PAINEL.
        JPanel p = new JPanel();

        // ABAIXO - Começando a adicionar componentes ao Panel.
        // ABAIXO - Escrevendo um texto qualquer na janela.
        JLabel l = new JLabel("Digite seu nome:");
        p.add(l); // AO LADO - Adicionei o componente que acabei de fazer ao Panel.

        // ABAIXO - Criando uma caixa de texto para escrever o nome.
        JTextField t = new JTextField(); 
        // t.setText("Alguma coisa padrão");
        t.setColumns(10); // 10 é o número de colunas.
        p.add(t);

        // ABAIXO - Criando um botão.
        JButton b = new JButton("Ok");
        AcaoBotao acao = new AcaoBotao(t); // AO LADO - Adicionei a classe em que está o LISTENER ++ Com uma referência a ***t*** após criar o showMessegeDialog.
        b.addActionListener(acao); // AO LADO - Adicionei o objeto acima, como sendo um LISTENER do botão.
        p.add(b);
        // 0000000000 Registrando o LISTENER nesse botão ACIMA.

        // TRATAMENTO DE EVENTOS - A ARQUITETURA DE SWING é baseada em ***Listeners***.
        // Listener - Objetos que ficam "ouvindo" a ocorrencia de eventos.
        // Por Exemplo: Eu PRECISO de um OBJETO LISTENER que fique "ouvindo" eventos de click no botão.




        f.add(p); // AO LADO - Adicionei o Panel na minha janela/frame.
        // ABAIXO - Por fim, para a janela realmente ser desenhada na tela, temos que dizer que ela é visível.
        f.setVisible(true);
    }
}
