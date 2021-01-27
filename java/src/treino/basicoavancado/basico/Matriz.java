package treino.basicoavancado.basico;

public class Matriz {

    public static void main(String[] args) {

        //Matriz - Array Bidimensional.
        String[][] nomes = new String[3][4]; // (linhas, colunas)

        nomes[0][0] = "Mateus";
        System.out.println(nomes[0][0]);

        String[][] nome = {
            // Coluna 0, Coluna 1
            {"Mateus", "Milene"},// Linha 0
            {"Gabriela", "João Paulo"} //Linha 1
        };

        System.out.println(nome[1][0]); // Acessando "Gabriela"
    }
    
}
