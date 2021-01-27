// STATIC
package treino.basicoavancado.objetos;

public class SalaDeAula {

    // Uma sala de aula pode ter vários alunos
    // O atributo aluno poderá ser instanciado várias vezes, alunos diferentes
    String aluno;
    // Uma sala de aula terá só um professor
    // O professor será um só para todos os alunos
    // static deixa o atributo global, deixa o atributo pertencente a classe, ele será um só para qualquer instancia de objeto.
    static String professor;

    // Métodos static não podem acessar atributos que pertencem a instância/objeto.
    static void ensinar() {
        System.out.println(professor + " ensinando.");
    }

    public static void main(String[] args) {
        // Um atributo static não precisa ser inicializado, pois ele já foi inicializado.
        // Posso acessar o professor sem instanciar ele
        SalaDeAula.professor = "Carlos Henrique";
        SalaDeAula.ensinar();

        // Podem ser várias alunos, então temos que instanciar, pois não será static.
        SalaDeAula aluno1 = new SalaDeAula();
        aluno1.aluno = "Mateus";

        System.out.println(aluno1.professor);
    }
    
}
