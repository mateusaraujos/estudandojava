package treino.basicoavancado.objetos;

public class PessoaC {

    String nome = "Mateus";
    String nomes;

    // this. no construtor faz referência a um atributo que pertence a classe.
    PessoaC(String n) {
        // this.nomes referência o (nomes) que tem na classe, e ele recebe o valor que será dado.
        this.nomes = n;
        String nome = "Milene";

        // this.nome vai me dar o nome "Mateus" que está no atributo nome dentro da classe.
        System.out.println("Meu nome é " + this.nome + ", e a minha irmã se chama " + nome);
    }
    
}
