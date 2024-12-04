package partetres.collections.exsimples;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //add os nomes
        nomes.add("Ana");
        nomes.add("Bob");
        nomes.add("Paul");
        nomes.add("Carla");

        nomes.add(1, "Pafúncio");
        nomes.add(3, "Anabele" );
        nomes.add(0, "Ana"); //adicionando um elemento duplicado
        System.out.println("Minha lista de nomes: " + nomes);

        nomes.remove("Carla");
        System.out.println("Iterando sobre os nomes");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //buscando um elemento
        boolean contemBob = nomes.contains("Bob");
        System.out.println("A lista contém Bob? " + contemBob);
        //obtendo o tamanho da lista
        int tamanho = nomes.size();
        System.out.println("A lista contém: " + tamanho + " nomes");
        nomes.clear();
        System.out.println("Depois de limpar a lista: " + nomes);
    }
}
