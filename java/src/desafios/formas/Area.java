package desafios.formas;

import java.util.Scanner;

public class Area {

    static Scanner teclado = new Scanner(System.in);

    public static void menu() {

        Formas quadrado;
        Formas circulo;

        System.out.print("Digite a largura de um quadrado: ");
        quadrado = new Quadrado(teclado.nextInt());

        System.out.print("Digite o raio do círculo: ");
        circulo = new Circulo(teclado.nextInt());

        System.out.println("===================================================");
        quadrado.area();
        circulo.area();
        System.out.println("===================================================");

    }

    public static void main(String[] args) {

        Area.menu();

    }
}