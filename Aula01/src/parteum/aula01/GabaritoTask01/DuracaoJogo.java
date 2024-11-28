package parteum.aula01.GabaritoTask01;
// algoritmo UM
import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início (horas e minutos):");
        System.out.print("Horas: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutoInicio = scanner.nextInt();

        System.out.println("Digite a hora de término (horas e minutos):");
        System.out.print("Horas: ");
        int horaTermino = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutoTermino = scanner.nextInt();

        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int terminoEmMinutos = horaTermino * 60 + minutoTermino;

        int duracaoEmMinutos;
        if (terminoEmMinutos >= inicioEmMinutos) {
            duracaoEmMinutos = terminoEmMinutos - inicioEmMinutos;
        } else {
            duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + terminoEmMinutos;
        }

        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;

        System.out.printf("Duração do jogo: %d horas e %d minutos\n", duracaoHoras, duracaoMinutos);

        scanner.close();
    }
}
