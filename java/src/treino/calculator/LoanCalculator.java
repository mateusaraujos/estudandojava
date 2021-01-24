package treino.calculator;

import java.util.Scanner;

public class LoanCalculator {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("[ Calcular o valor restante do Montante ]\nEmprestimo: ");
		//emprestimo
		float emp = teclado.nextFloat();

		//percentual
		float per = ((emp * 10) / 100);
		float tira = (emp - per);

		System.out.print("Mes: ");
		int mes = teclado.nextInt();

		for (int i = 1; i <= mes; i++) {
			System.out.println("-------------------------------------\nMes " + i);
			System.out.println("Pagamento: 10% de " + emp + " = " + per + "\nMontante Restante: " + tira);
			emp -= per;
			per -= ((per * 10) / 100);
			tira = emp - per;
		}
		System.out.println("-------------------------------------");
	}
}