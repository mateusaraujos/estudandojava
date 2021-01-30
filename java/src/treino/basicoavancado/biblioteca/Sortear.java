package treino.basicoavancado.biblioteca;

import java.util.Random;

public class Sortear {
    // random()

    public static void main(String[] args) {
        // Math.random();
        // Sorteia um número entre 0.00000000001 e 0.99999999999
        // (int) (Math.random * 10) gera um aleatorio de 0 a 9

        Random sortear = new Random();
        // sortear.nextInt((nMax + 1) - nMín) + nMín;
        int formule = sortear.nextInt((15 + 1) - 10) + 10;

        System.out.println(formule);
    }
    
}
