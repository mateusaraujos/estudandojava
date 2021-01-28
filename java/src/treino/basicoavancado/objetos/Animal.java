package treino.basicoavancado.objetos;

public class Animal {

    /* Padrão
    public Animal() {
        super();
    }
    */

    String raca;
    double peso;
    public Animal(String raca, double peso) {
        // super(); já é escrito aqui, por causa da classe pai Object
        // Serve para referenciar a super classe.
        this.raca = raca;
        this.peso = peso;
    }

    /**
     * SE A CLASSE PAI TIVER UM CONSTRUTOR COM PARÂMETROS, TENHO QUE CHAMAR O CONSTRUTOR COM OS PARÂMETROS.
     * public  class Cachorro extends Animal {
     *     public Cachorro() {
     *         super("pitbull", 30);
     *     }
     * }
     * 
     */

    public static void main(String[] args) {
        Animal teste = new Animal("pitbull", 22);
    }
    
}
