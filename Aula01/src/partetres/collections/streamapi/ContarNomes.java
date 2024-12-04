package partetres.collections.streamapi;

import java.util.Arrays;
import java.util.List;

public class ContarNomes {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana", "Pafúncio", "Jocelmo", "Mafalda");

        long nomesGrandes = nomes.stream()
                .filter(nome -> nome.length() > 5) // Filtra nomes com mais de 5 letras
                .count(); // Conta os nomes filtrados

        System.out.println("Número de nomes com mais de 5 letras: " + nomesGrandes);
    }
}

