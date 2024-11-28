package parteum.aula01.GabaritoTask01;
// algoritmo SETE

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[quantidadeAlunos];
        double[] medias = new double[quantidadeAlunos];

       for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Digite o nome do aluno: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota da primeira prova: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a nota da segunda prova: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Digite a nota da terceira prova: ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine();

            medias[i] = (nota1 + nota2 + nota3) / 3.0;
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("%s: %.2f\n", nomes[i], medias[i]);
        }

        scanner.close();
    }
}

