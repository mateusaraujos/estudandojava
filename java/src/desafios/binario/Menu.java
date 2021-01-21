package desafios.binario;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {
    static Scanner teclado = new Scanner(System.in);

    public static void chamando(int n) throws InterruptedException {
        switch (n) {
            case 0 :
                System.out.println("Tchau :)");
                System.exit(0);
                break;
            case 1 : 
                ParaBinario.decimalBinario();
                TimeUnit.SECONDS.sleep(2);
                Menu.menu();
                break;
            case 2 : 
                ParaDecimal.binarioDecimal();
                TimeUnit.SECONDS.sleep(2);
                Menu.menu();
                break;
            default : 
                System.out.println("***[Digite 0, 1 ou 2]***");
                Menu.menu();
        }
    }

    public static void menu() throws InterruptedException {
        System.out.print("===========================\n[1] De DECIMAL para BINÁRIO.\n[2] De BINÁRIO para DECIMAL.\n[0] Para sair.\n===========================\nDigite o número aqui: ");
        int entrada = teclado.nextInt();

        chamando(entrada);
    }
}
