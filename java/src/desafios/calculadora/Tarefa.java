package desafios.calculadora;
import java.util.*;

public class Tarefa {
	static Scanner teclado = new Scanner(System.in);

	public static void emprestimoRestante() {
		System.out.print("Digite o valor do empréstimo: R$");
		float entrada = teclado.nextFloat();

		System.out.print("Digite o mês de pagamento: ");
		int entradaMes = teclado.nextInt();

		float percentual = ((entrada * 10) / 100);

		if (entrada <= 0 || entradaMes <= 0) {
			System.out.println("***[Erro: Empréstimo ou Mês inválido.]***");
			Tarefa.emprestimoRestante();
		} else {
			System.out.println("===========================================");
			for (int i = 1; i <= entradaMes; i++) {
				System.out.println("===========================================\nMês " + i + ":\nPagamento: 10% de "
						+ entrada + " = " + percentual + "\nMontante Restante: " + (entrada - percentual)
						+ "\n===========================================");
				entrada -= percentual;
				percentual -= (percentual * 10 / 100);
			}
			System.out.println("===========================================");
		}
	}
}
