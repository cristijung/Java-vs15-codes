package parteum.aula01.GabaritoTask01;
// algoritmo CINCO

import java.util.Scanner;

public class CalculoVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de votos: ");
        int totalVotos = scanner.nextInt();

        System.out.print("Digite o número de votos em branco: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        int votosValidos = totalVotos - votosBrancos - votosNulos;

        double percentualBrancos = (double) votosBrancos / totalVotos * 100;
        double percentualNulos = (double) votosNulos / totalVotos * 100;
        double percentualValidos = (double) votosValidos / totalVotos * 100;

        System.out.println("\nResultados:");
        System.out.printf("Votos em branco: %.2f%%\n", percentualBrancos);
        System.out.printf("Votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Votos válidos: %.2f%%\n", percentualValidos);

        scanner.close();
    }
}
