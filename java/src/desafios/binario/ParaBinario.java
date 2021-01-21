package desafios.binario;
import java.util.Scanner;

public class ParaBinario {
    static Scanner teclado = new Scanner(System.in);

    public static void decimalBinario() {
        System.out.print("Digite um número decimal para converter em Número Binário: ");
        int decimal = teclado.nextInt();
        int guardado = decimal;

        String binario = "";
        if (decimal == 0) {
            binario = binario + "0";
        } else {
            while (decimal > 0) {
                binario = (decimal % 2) + binario;
                decimal /= 2;
            }
        }
        
        System.out.println("O número decimal " + guardado + " equivale ao número binário " + binario + ".");
    }
}
