package partetres.collections.exsimples;

import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        //add
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);

        //exibir
        System.out.println("Números no conjunto: " + numeros);

        //remover
        numeros.remove(2);
        System.out.println("Depois de remover 2: " + numeros);

        //iterando
        System.out.println("Iterando sobre os números:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //buscando
        boolean contemNove = numeros.contains(9);
        System.out.println("O conjunto contém 9? " + contemNove);

        //menor e maior número do conjunto
        int menorNumero = numeros.first();
        int maiorNumero = numeros.last();
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);

        //limpando
        numeros.clear();
        System.out.println("Depois de limpar o conjunto: " + numeros);
    }
}

