package partetres.exceptions;

import java.io.IOException;

public class ExcecaoModelo {
    public static void main(String[] args) {
        try {
            metodoQuePodeLancarExcecao();
        } catch (IOException e) {
            System.err.println("Erro de E/S: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro genérico: " + e.getMessage());
        } finally {
            System.out.println("Execução do bloco finally.");
        }
    }

    public static void metodoQuePodeLancarExcecao() throws IOException {
        boolean problema = true; //simulando um problema
        if (problema) {
            throw new IOException("Simulação de um erro de E/S.");
        }
    }
}

