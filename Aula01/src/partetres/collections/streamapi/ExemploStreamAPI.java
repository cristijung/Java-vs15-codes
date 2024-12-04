package partetres.collections.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        // Criando uma lista de números
        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 2, 4, 6, 8);

        // Filtrando números pares
        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        // Mostrando a lista de números pares
        System.out.println("Números pares: " + pares);

        // Mapeando números para seus quadrados
        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        // Mostrando a lista de quadrados
        System.out.println("Quadrados dos números: " + quadrados);

        // Somando os números
        int soma = numeros.stream()
                .reduce(0, (acumulador, numero) -> acumulador + numero);

        // Mostrando a soma dos números
        System.out.println("Soma dos números: " + soma);

        // Calculando a média dos números
        double media = numeros.stream()
                .mapToDouble(numero -> numero)
                .average()
                .getAsDouble();

        // Mostrando a média dos números
        System.out.println("Média dos números: " + media);
    }
}
