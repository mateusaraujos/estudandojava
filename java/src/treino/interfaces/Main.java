package treino.interfaces;

public class Main {
    public static void main(String[] args) {
        Interface fazendoCoisas = new Implementando();

        fazendoCoisas.comer();
        fazendoCoisas.beber();
    }
}
