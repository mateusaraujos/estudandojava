package treino.basicoavancado.biblioteca;

import java.net.URI;

import javax.swing.JOptionPane;

import java.awt.Desktop;

public class AbrirLink {

    public static void main(String[] args) {

        try {

            URI link = new URI("https://studeo.unicesumar.edu.br/#!/access/login");
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja abrir o seu Studeo?");
            if (opcao == 0) {
                JOptionPane.showMessageDialog(null, "Clique OK para abrir :)");
                Desktop.getDesktop().browse(link);
            } else if (opcao == 1) {
                JOptionPane.showMessageDialog(null, "Até logo!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
