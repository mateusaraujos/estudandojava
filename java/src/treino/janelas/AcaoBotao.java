package treino.janelas;

// Um Listener de eventos de botão deve implementar a interface ActionListener.
import java.awt.event.ActionListener;

// Sou obrigado a implementar actionPerformed() com a classe ActionEvent.
import java.awt.event.ActionEvent;

// Para uma referência ao componete da caixa de texto que criamos.
import javax.swing.JTextField;

// Para abrir uma caixa de diálogo.
import javax.swing.JOptionPane;


// Linha 50 de Janela.java - Temos que criar o Listener.

public class AcaoBotao implements ActionListener {

    // Referência ao componente da caixa de texto.
    private JTextField t;

    // Depois da referência, eu crio um construtor que recebe o t como parâmetro.
    public AcaoBotao(JTextField t) {
        this.t = t;
    }

    // Quando eu implemento a interface ActionListener, sou obrigado a implementar o método actionPerformed().
    @Override
    public void actionPerformed(ActionEvent e) {
        // **e** - Event Object
        // O próprio swing vai invocar esse método.
        // Com o ActionEvent temos acesso ao componente que disparou o evento.
        // 0000000000 Antes de tudo, temos que REGISTRAR O LISTENER no botão que criamos para avisar ao java quem está ouvidno o evento do botão.

        // Depois de ter uma referência na classe do TextField da caixa de texto criada.
        String nome = t.getText();
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Bom te ver por aqui.", "Boas Vindas", 1);
    }

    
}
