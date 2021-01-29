package treino.basicoavancado.biblioteca;

public class Tamanho {
    // length() - tamanho de Strings ou arrays
    // No caso de Strings, é um Método. No caso de Arrays, é um Atributo.

    public static void main(String[] args) {
        String nome = "Mateus";
        int tamanho = nome.length(); // Método
        System.out.println(tamanho);

        String[] nomes = {"Mateus", "Milene", "Gabriela"};
        int tamanhos = nomes.length; // Atributo
        System.out.println(tamanhos);
    }
    
}
