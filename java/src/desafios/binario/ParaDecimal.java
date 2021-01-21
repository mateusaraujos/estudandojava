package desafios.binario;
import java.util.Scanner;

public class ParaDecimal {
    static Scanner teclado = new Scanner(System.in);

    public static void binarioDecimal() {
        long n, resto, resultado = 0, exp = 0;

        System.out.print("Digite um número binário para converter em Número Decimal: ");
        n = teclado.nextLong();
        long guardado = n;

        do {
            resto = n % 10;
            resultado = resultado + resto * (int) Math.pow(2, exp);
            exp++;
            n /= 10;
        } while (n > 0);

        System.out.println("O número binário " + guardado + " equivale ao número decimal " + resultado + ".");
    }
}