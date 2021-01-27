package treino.basicoavancado.objetos;

public class NParametros {

    // Esse método faz um array de indefinidos números/posições.
    // "numeros" é o nome do parâmetro que será um vetor de inteiros indefinido.
    static int somarNumeros(int ... numeros) {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static void main(String[] args) {
        // Posso passar uma quantidade de parâmetros indefinida
        int soma = NParametros.somarNumeros(23, 23, 5, 5, 3, 1);
        System.out.println(soma);
    }
    
}
