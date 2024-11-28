package parteum.aula01.GabaritoTask01;
// algoritmo DEZ
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");
        System.out.println("5. Cálculo de área de um círculo");
        System.out.println("6. Cálculo de área de um retângulo");
        System.out.println("7. Cálculo de área de um triângulo");
        System.out.println("8. Cálculo de diâmetro de um círculo");
        System.out.print("Escolha a operação desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                double numero1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double numero2 = scanner.nextDouble();
                double soma = numero1 + numero2;
                System.out.println("Resultado: " + soma);
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                double minuendo = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double subtraendo = scanner.nextDouble();
                double diferenca = minuendo - subtraendo;
                System.out.println("Resultado: " + diferenca);
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                double multiplicando = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double multiplicador = scanner.nextDouble();
                double produto = multiplicando * multiplicador;
                System.out.println("Resultado: " + produto);
                break;
            case 4:
                System.out.print("Digite o dividendo: ");
                double dividendo = scanner.nextDouble();
                System.out.print("Digite o divisor: ");
                double divisor = scanner.nextDouble();
                if (divisor != 0) {
                    double quociente = dividendo / divisor;
                    System.out.println("Resultado: " + quociente);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 5:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            case 6:
                System.out.print("Digite a base do retângulo: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("Área do retângulo: " + areaRetangulo);
                break;
            case 7:
                System.out.print("Digite a base do triângulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaTriangulo = scanner.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("Área do triângulo: " + areaTriangulo);
                break;
            case 8:
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                double diametroCirculo = 2 * raioCirculo;
                System.out.println("Diâmetro do círculo: " + diametroCirculo);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

