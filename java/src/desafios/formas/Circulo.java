package desafios.formas;

public class Circulo extends Formas {

    private int largura;

    public Circulo(int largura) {

        this.largura = largura;

    }

    public void area() {

        System.out.println("Área do círculo: " + (double) (Math.PI * (Math.pow(largura, 2))) + "m².");

    }
    
}
