package treino.basicoavancado.biblioteca;

import java.util.ArrayList;

public class ArrayAprimorado {

    // ArrayList - vetor aprimorado, temos que instanciar
    // Tem recursos aprimorados
    // ArrayList não aceita Tipos Primitivos, só aceita objetos, wraps
    // ArrayList<tipoDado> nomes = new ArrayList<String>();

    public static void main(String[] args) {
        // Posso instanciar um objeto ArrayList e não me preocupar com a quantidade de posições inicias do array
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Mateus");
        nomes.add("Milene");
        // nomes.remove(1); também remove
        nomes.remove("Milene");
        // nomes.clear(); limpa todo o arraylist
        // nomes.toString(); mostra todo o array
        // nomes.isEmpty(); diz se o array está vazio
        // nomes.contains("Mateus"); pesquisa, no array, se contêm "Mateus"
        // nomes.get(0); retorna o valor na posição 0
        System.out.println(nomes.indexOf("Mateus")); // Caso não encontre, retorna -1
        // nomes.size(); retorna o tamanho do array
    }
    
}
