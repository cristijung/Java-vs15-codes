package parteum.aula01.GabaritoTask01;
// algoritmo QUATRO ---> sem Java Time

public class GeracoesBrasileiras {
    public static void main(String[] args) {
        int anoChegadaPortugueses = 1500;
        int anoAtual = obterAnoAtual();
        int mediaIdadeFilhos = 28;
        int anosPassados = anoAtual - anoChegadaPortugueses;
        int numeroGeracoes = anosPassados / mediaIdadeFilhos;


        System.out.println("Desde 1500 até o ano atual, passaram " + numeroGeracoes + " gerações.");
    }

   private static int obterAnoAtual() {
        long milissegundosDesdeEpoca = System.currentTimeMillis();
        long segundosDesdeEpoca = milissegundosDesdeEpoca / 1000;
        long minutosDesdeEpoca = segundosDesdeEpoca / 60;
        long horasDesdeEpoca = minutosDesdeEpoca / 60;
        long diasDesdeEpoca = horasDesdeEpoca / 24;
        long anosDesdeEpoca = diasDesdeEpoca / 365;

        return (int) anosDesdeEpoca + 1970;
    }
}

