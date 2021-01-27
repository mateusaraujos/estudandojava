package treino.basicoavancado.basico;

public class Foreach {

    public static void main(String[] args) {

        String[] nomes = {"Mateus", "Milene", "Gabriela", "João Paulo"};

        // Receber cada posição do Array com foreach.
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Somando as posições do array.
        int soma = 0;
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
    
}
