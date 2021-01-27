package treino.basicoavancado.objetos;

public class Sobrecarga {

    String nome;
    int idade;

    Sobrecarga(String nome) {
        // Referenciando o atributo com this
        this.nome = nome;
    }

    Sobrecarga(String nome, int idade) {
        // Referenciando o constructor com this
        this(nome);
        this.idade = idade;
    }

    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        // Referenciando o método com this
        return this.somar(a, b) + c;
    }

    public static void main(String[] args) {
        Sobrecarga somaDois = new Sobrecarga("Mateus");
        Sobrecarga somaTres = new Sobrecarga("Mateus", 22);
        int soma2 = somaDois.somar(5, 2);
        int soma3 = somaTres.somar(5, 2, 3);

        System.out.println(soma2);
        System.out.println(soma3);
        System.out.println(somaDois.nome);
        System.out.println(somaTres.idade);

    }
    
}
