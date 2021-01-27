package treino.basicoavancado.objetos;

public class Metodos {

    public static void main(String[] args) {
        PessoaM eu = new PessoaM();
        System.out.println(eu.nome); // Vai sair "null"
        eu.dormir();
    }
    
}
