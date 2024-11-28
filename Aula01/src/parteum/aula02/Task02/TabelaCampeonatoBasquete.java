package parteum.aula02.Task02;

import java.util.Scanner;

public class TabelaCampeonatoBasquete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CAPACIDADE = 100;
        String[] timesCasa = new String[CAPACIDADE];
        String[] timesVisitante = new String[CAPACIDADE];
        int[] pontuacoesCasa = new int[CAPACIDADE];
        int[] pontuacoesVisitante = new int[CAPACIDADE];
        String[] datas = new String[CAPACIDADE];
        int contador = 0;

        while (true) {
            System.out.println("Menu de Opções:");
            System.out.println("1. Inserir novo jogo");
            System.out.println("2. Exibir todos os jogos");
            System.out.println("3. Buscar jogos por time");
            System.out.println("4. Exibir classificação dos times");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                if (contador < CAPACIDADE) {
                    System.out.print("Digite o nome do time da casa: ");
                    String timeCasa = scanner.nextLine();
                    System.out.print("Digite o nome do time visitante: ");
                    String timeVisitante = scanner.nextLine();
                    System.out.print("Digite a pontuação do time da casa: ");
                    int pontuacaoCasa = scanner.nextInt();
                    System.out.print("Digite a pontuação do time visitante: ");
                    int pontuacaoVisitante = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a data do jogo (dd/mm/yyyy): ");
                    String data = scanner.nextLine();

                    timesCasa[contador] = timeCasa;
                    timesVisitante[contador] = timeVisitante;
                    pontuacoesCasa[contador] = pontuacaoCasa;
                    pontuacoesVisitante[contador] = pontuacaoVisitante;
                    datas[contador] = data;
                    contador++;
                    System.out.println("Jogo inserido com sucesso!");
                } else {
                    System.out.println("Capacidade máxima atingida!");
                }
            } else if (opcao == 2) {
                System.out.println("Tabela de Jogos:");
                for (int i = 0; i < contador; i++) {
                    System.out.println("Time da Casa: " + timesCasa[i] + " (" + pontuacoesCasa[i] + ") x (" + pontuacoesVisitante[i] + ") " + timesVisitante[i] + ", Data: " + datas[i]);
                }
            } else if (opcao == 3) {
                System.out.print("Digite o nome do time a ser buscado: ");
                String timeBuscado = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < contador; i++) {
                    if (timesCasa[i].equalsIgnoreCase(timeBuscado) || timesVisitante[i].equalsIgnoreCase(timeBuscado)) {
                        System.out.println("Jogo encontrado! Time da Casa: " + timesCasa[i] + " (" + pontuacoesCasa[i] + ") x (" + pontuacoesVisitante[i] + ") " + timesVisitante[i] + ", Data: " + datas[i]);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Time não encontrado!");
                }
            } else if (opcao == 4) {
                // arrays para armazenar nomes dos times e suas pontuações totais
                String[] times = new String[2 * CAPACIDADE];
                int[] pontuacoesTotais = new int[2 * CAPACIDADE];
                int numTimes = 0;

                //atualizar pontuações totais dos timessss
                for (int i = 0; i < contador; i++) {
                    numTimes = atualizarPontuacao(times, pontuacoesTotais, timesCasa[i], pontuacoesCasa[i], numTimes);
                    numTimes = atualizarPontuacao(times, pontuacoesTotais, timesVisitante[i], pontuacoesVisitante[i], numTimes);
                }

                //raking da classificação dos times por pontuação
                for (int i = 0; i < numTimes - 1; i++) {
                    for (int j = 0; j < numTimes - 1 - i; j++) {
                        if (pontuacoesTotais[j] < pontuacoesTotais[j + 1]) {
                            //aqui está trocando as  posições
                            int tempPontuacao = pontuacoesTotais[j];
                            pontuacoesTotais[j] = pontuacoesTotais[j + 1];
                            pontuacoesTotais[j + 1] = tempPontuacao;

                            String tempTime = times[j];
                            times[j] = times[j + 1];
                            times[j + 1] = tempTime;
                        }
                    }
                }

                //exibindo a classificação dos times ...
                System.out.println("Classificação dos Times:");
                for (int i = 0; i < numTimes; i++) {
                    System.out.println("Time: " + times[i] + ", Pontuação Total: " + pontuacoesTotais[i]);
                }
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static int atualizarPontuacao(String[] times, int[] pontuacoesTotais, String time, int pontuacao, int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            if (times[i].equalsIgnoreCase(time)) {
                pontuacoesTotais[i] += pontuacao;
                return numTimes;
            }
        }
        times[numTimes] = time;
        pontuacoesTotais[numTimes] = pontuacao;
        return numTimes + 1;
    }
}
