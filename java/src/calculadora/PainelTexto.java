package calculadora;

import java.awt.FlowLayout;

import javax.swing.*;

public class PainelTexto extends JPanel {

    private JTextField textNumber;

    public PainelTexto() {

        setLayout(new FlowLayout());

        textNumber = new JTextField(15);
        textNumber.setHorizontalAlignment(JTextField.RIGHT);
        textNumber.setEnabled(false);
        add(textNumber);

    }

    public JTextField getTxtNumber() {
        return textNumber;
    }
    
}
