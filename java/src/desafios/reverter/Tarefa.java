package desafios.reverter;
import java.util.Scanner;

public class Tarefa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void frasesSesarf() {
		System.out.print("Digite a frase: ");
		char[] entrada = teclado.nextLine().toCharArray();
		
		System.out.print("Da direita para a esquerda: ");
		for (int i = entrada.length - 1; i >= 0; i--) {
			System.out.print(entrada[i]);
		}
	}
}
