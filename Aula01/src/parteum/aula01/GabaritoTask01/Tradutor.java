package parteum.aula01.GabaritoTask01;
// algoritmo NOVE
import java.util.Scanner;

public class Tradutor {
    public static void main(String[] args) {
        String[] palavrasIngles = {"Cachorro", "Cidade", "Feliz", "Triste"};
        String[] palavrasPortugues = {"Dog", "City", "Happy", "Sad"};


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para tradução: ");
        String palavra = scanner.nextLine();

        boolean traduzido = false;
        for (int i = 0; i < palavrasIngles.length; i++) {
            if (palavrasIngles[i].equalsIgnoreCase(palavra)) {
                System.out.println("Tradução para português: " + palavrasPortugues[i]);
                traduzido = true;
                break;
            }
        }

        if (!traduzido) {
            for (int i = 0; i < palavrasPortugues.length; i++) {
                if (palavrasPortugues[i].equalsIgnoreCase(palavra)) {
                    System.out.println("Tradução para inglês: " + palavrasIngles[i]);
                    traduzido = true;
                    break;
                }
            }
        }

        if (!traduzido) {
            System.out.println("Essa palavra não é válida.");
        }

        scanner.close();
    }
}

