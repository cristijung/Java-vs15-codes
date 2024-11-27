//FOR-EACH: para cada
package parteum.aula02;

public class ForEach {
    public static void main(String[] args) {
        int[] multiplicadores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Tabuada do 8:");

        for (int multiplicador : multiplicadores) {
            int resultado = 8 * multiplicador;
            System.out.println("8 x " + multiplicador + " = " + resultado);
        }
    }
}
