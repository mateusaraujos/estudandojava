package treino.reverse;

import java.util.Scanner;

public class ReverseString {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-------------------------------------\nEscreva e Reverta\n-------------------------------------");
		System.out.print("Escreva o texto aqui: ");
		char[] texto = teclado.nextLine().toCharArray();

		System.out.print("Texto reverso: ");
		for (int i = texto.length - 1; i >= 0; i--) {
			System.out.print(texto[i]);
		}
	}
}