package treino.basicoavancado.biblioteca;

public class Alterar {
    // Método replace() da classe String

    public static void main(String[] args) {
        String frase = "Eu vou para o Canadá.";
        // Alterar algum caractere ou palavra
        // frase.replace(Oldchar, newChar); retorna uma nova String com a substituição
        String nova = frase.replace(".", "!");
        System.out.println(nova);

        String primeira = frase.replaceFirst("o", "ooooooo");
        // Troca a primeria ocorrência que encontrar
        System.out.println(primeira);
    }
    
}
