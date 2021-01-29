package treino.basicoavancado.biblioteca;

public class Separar { 
    // Método split() da classe String.

    public static void main(String[] args) {
        String nome = "BRASILsepararARGENTINAsepararCANADÁ";
        // Quero o nome separado pelos espaços
        // nome.split(" ", 3); Vai retornar um vetor de String com as possições que ele separou com 3 posições.
        String[] nomes = nome.split("separar"); // Separa o array por "separar"
        System.out.println(nomes[2]);
    }
    
}
