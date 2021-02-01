//Ler aquivo.txt
package treino.basicoavancado.biblioteca;

import javax.swing.*;
import java.nio.file.*;

public class LerArquivo {

    public static void main(String[] args) {

        // Mesmo que eu mude o texto
        Path caminho = Paths.get("D:/Usuários/Mateus/Área de Trabalho/hello.txt");

        try {
            byte[] texto = Files.readAllBytes(caminho); // retorna um array de bytes
            String leitura = new String(texto);

            JOptionPane.showMessageDialog(null, leitura);
        } catch (Exception erro) {}

    }
    
}
