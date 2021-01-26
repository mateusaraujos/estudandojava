package calculadora;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelOperacoes extends JPanel implements ActionListener {

    private JTextField txtTexto;

    // Preciso armazenar o que está acontecendo na calculadora.
    // Preciso saber qual a operação e os valores que estão sendo digitados para que ocorra a operação.
    private char operacao;
    private double valor1;
    private double valor2;
    // Até esses aqui de cima.

    private JButton btnMais;
    private JButton btnMenos;
    private JButton btnVezes;
    private JButton btnDividir;
    private JButton btnIgual;
    private JButton btnClean;


    public PainelOperacoes(JTextField txtTexto) {

        this.txtTexto = txtTexto;

        setLayout(new GridLayout(3, 2));

        btnMais = new JButton("+");
        btnMais.addActionListener(this);
        add(btnMais);

        btnMenos = new JButton("-");
        btnMenos.addActionListener(this);
        add(btnMenos);

        btnVezes = new JButton("*");
        btnVezes.addActionListener(this);
        add(btnVezes);

        btnDividir = new JButton("/");
        btnDividir.addActionListener(this);
        add(btnDividir);

        btnIgual = new JButton("=");
        btnIgual.addActionListener(this);
        add(btnIgual);

        btnClean = new JButton("C");
        btnClean.addActionListener(this);
        add(btnClean);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // isEmpty() verifica se a String está vazia.
        if (txtTexto.getText().isEmpty()) {
            return;
        }

        JButton btn = (JButton) e.getSource();

        if (btn == btnClean) {

            operacao = '\u0000'; // '\u0000' é o que seria um (null) para um objeto.

            txtTexto.setText("");

        } else if (btn == btnIgual) {

            valor2 = Double.parseDouble(txtTexto.getText());

            double result = 0.0;

            if (operacao == '+') {

                result = valor1 + valor2;

            } else if (operacao == '-') {

                result = valor1 - valor2;

            } else if (operacao == '*') {

                result = valor1 * valor2;

            } else if (operacao == '/') {

                result = valor1 / valor2;

            }

            // O texto da caixa de texto recebe uma String e result é um double, tenho que converter o double em String com String.valueOf(result);
            txtTexto.setText(String.valueOf(result));
            operacao = '\u0000'; // Reset a operacao.
            valor1 = result;
            valor2 = 0;

        } else { // Operações

            // charAt(0) retorna a primeira posição da String, que é onde está o nome da operação.
            operacao = btn.getText().charAt(0);
            valor1 = Double.parseDouble(txtTexto.getText());
            txtTexto.setText(""); // Para limpar a caixa de texto.
        }

    }
    
}
