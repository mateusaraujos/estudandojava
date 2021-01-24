package treino.converter;

import java.util.Scanner;

public class TimeConverter {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("=== Converto dias em segundos ===\nDias: ");
		int dias = teclado.nextInt();

		int segundos = (dias * 24 * 60 * 60);

		if (dias <= 0) {
			System.out.println("Error.");
		} else if (dias == 1) {
			System.out.println("1 dia tem " + segundos + " segundos.");
		} else {
			System.out.println(dias + " dias têm " + segundos + " segundos.");
		}
	}
}