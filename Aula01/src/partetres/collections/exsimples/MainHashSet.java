package partetres.collections.exsimples;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Alice");
        nomes.add("Ana");
        nomes.add("Bob");
        nomes.add("Call");

        System.out.println("Nomes pertencentes ao conjunto: " + nomes);

        //hashset é uma estrutura de conjunto, portanto não será possível add elementos duplicados,
        //pois conjuntos não permitem duplicatas
        nomes.add("Alice");
        System.out.println("Conjunto: " + nomes);

        //removendo
        nomes.remove("Bob");
        System.out.println("Conjunto: " + nomes);

        //iterando
        System.out.println("Iterando ...");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //tamanho
        int tamanho = nomes.size();
        System.out.println("Tamanho do conjunto: " + tamanho + " de elementos.");

        //limpando
        nomes.clear();
        System.out.println("Conjunto depois de limpar ... " + nomes);


    }

}
