package treino.basicoavancado.basico;

public class Variaveis {

    public static void main(String[] args) {

        // tipo nome = conteudo;
        String meuNome = "Mateus Aráujo Silva";
        int idade = 22;
        double altura = 1.80;
        char sexo = 'M';
        boolean casado = false;

        System.out.println(meuNome + " tem " + idade + " anos.\nTem " + altura + " de altura.\nÉ do sexo " + sexo + ".");

        if (casado == true) {
            System.out.println("É casado!");
        } else {
            System.out.println("Não é casado!");
        }
        
    }
    
}
