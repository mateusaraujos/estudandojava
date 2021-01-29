package treino.basicoavancado.basico;

public class Converter {

    // classes wraps

    public static void main(String[] args) {
        int inteiro = Integer.parseInt("27");
        System.out.println(inteiro);

        double duplo = Double.parseDouble("3.5");
        System.out.println(duplo + " double.");

        boolean booleano = Boolean.parseBoolean("true");
        System.out.println(booleano);

        String strings = String.valueOf(duplo);
        System.out.println(strings + " String.");
    }
    
}
