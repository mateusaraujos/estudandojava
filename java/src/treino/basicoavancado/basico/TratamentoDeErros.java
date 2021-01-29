package treino.basicoavancado.basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
    //try/catch
    //catch(Exception erro) - trata qualquer tipo de erro
    
    static Scanner ler;
    public static void main(String[] args) {
        ler = new Scanner(System.in);
        try {
            int n = ler.nextInt(); // Tratar
            System.out.println(30 / n); // as duas linhas, pois podem dar erro
        } catch (InputMismatchException erro) { // Capturo os possíveis erros/exceção 
            System.out.println("Digite apenas números inteiros, erro " + erro); // E digo
        } catch (ArithmeticException erro) {
            System.out.println("Só podem números diferentes de zero, erro " + erro);
        } finally { // Termina a execução do TRY independentemente se ocorrer erros ou não
            System.out.println("Fim");
        }
        // Detectar as possíveis partes que podem ocorrer erros
    }
    
}
