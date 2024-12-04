package partetres.collections.exsimples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 2, 4, 6, 8);

        //Filtrando
        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());


        System.out.println("Números pares: " + pares);

        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + quadrados);

         int soma = numeros.stream()
                .reduce(0, (acumulador, numero) -> acumulador + numero);

        System.out.println("Soma dos números: " + soma);

        //calculando a média dos números
        double media = numeros.stream()
                .mapToDouble(numero -> numero)
                .average()
                .getAsDouble();

        //saída
        System.out.println("Média dos números: " + media);
    }
}
