package desafios.formas;

public class Quadrado extends Formas {

    private int largura;

    public Quadrado(int largura) {

        this.largura = largura;

    }

    public void area() {

        System.out.println("Área do quradrado: " + (double) (Math.pow(largura, 2)) + "m².");

    }
    
}
