package parteum.aula02;

public class ForEachDois {
    public static void main(String[] args) {
        int[] multiplicadores = new int[10];

        for (int i = 0; i < multiplicadores.length; i++) {
            multiplicadores[i] = i + 1;
        }


        System.out.println("Tabuada do 8:");

        for (int multiplicador : multiplicadores) {
            int resultado = 8 * multiplicador;
            System.out.println("8 x " + multiplicador + " = " + resultado);
        }
    }
}

