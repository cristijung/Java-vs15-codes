package parteum.aula01.GabaritoTask01;
// algoritmo SEIS
import java.util.Scanner;

public class SalarioAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.print("Digite o salário mensal do funcionário: ");
        double salarioMensal = scanner.nextDouble();

        System.out.print("Digite o número de meses trabalhados no ano: ");
        int mesesTrabalhados = scanner.nextInt();

        double salarioAnual = salarioMensal * mesesTrabalhados;

        System.out.printf("%s tem um salário anual de: %.2f\n", nomeFuncionario, salarioAnual);

        scanner.close();
    }
}
