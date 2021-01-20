package desafios.conversor;
import java.util.Scanner;

public class Tarefa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void diasSegundos() {
		System.out.print("Digite o número de dias: ");
		int dias = teclado.nextInt();
		int segundos = (dias * 24 * 60 * 60);
		if (dias <= 0) {
			System.out.println("***[Erro: Digite um número de dias válido!]***");
			Tarefa.diasSegundos();
		} else if (dias == 1) {
			System.out.println("1 dia tem " + segundos + " segundos.");
		} else {
			System.out.println(dias + " dias têm " + segundos + " segundos.");
		}
	}
}
