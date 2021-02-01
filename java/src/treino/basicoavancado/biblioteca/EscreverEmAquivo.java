// Escrever em arquivo.txt ou CRIAR um .txt
package treino.basicoavancado.biblioteca;

import java.nio.file.*;

public class EscreverEmAquivo {

    public static void main(String[] args) {
        Path caminho = Paths.get("D:/Usuários/Mateus/Área de Trabalho/hello.txt");
        // Mesmo se o caminho não existir, o programa vai criar um arquivo de texto no caminho indicado

        // Escrever dentro do arquivo que está guardado em caminho
        String texto = "Editando esse arquivo através de códigos em java:\nUsando a classe Path para referenciar, e a classe Paths para 'pegar o caminho'\n    Path caminho = Paths.get(D:/Usuários/Mateus/Área de Trabalho/hello.txt);\nUsando a classe Files:\n    Files.write(caminho, vetorDeBytes); -> texto.getBytes (retorna um vetor do que quer escrever)\n     *Dentro de um try/catch";
        byte[] vetorDeBytes = texto.getBytes();
        try {// Pois a url pode estar errada, e ocorrer um erro
            Files.write(caminho, vetorDeBytes);
        } catch (Exception e) {}
    }

}
