package treino.basicoavancado.objetos;

public class Classes {

    public static void main(String[] args) {

        // Referência a classe (Tipo) = Instância (new) Construtor da classe (Construtor();)
        Pessoa eu = new Pessoa();

        System.out.println(eu.nome);

        eu.nome = "Milene";
        // Atribui "Milene" apenas para o objeto eu

        System.out.println(eu.nome);

        // Se eu criar um novo objeto, volta a ser o que está lá na classe criada, que é o default "Mateus"
        Pessoa outra = new Pessoa();
        System.out.println(outra.nome);


    }
    
}
