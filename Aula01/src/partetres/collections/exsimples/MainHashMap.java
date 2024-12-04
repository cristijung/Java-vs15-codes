package partetres.collections.exsimples;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> idadePorNome = new HashMap<>();

        //add
        idadePorNome.put("Ana", 30);
        idadePorNome.put("Bob", 26);
        idadePorNome.put("Carla", 35);
        idadePorNome.put("Paul", 42);

        //exibir
        System.out.println("Nomes e idades no mapa: " + idadePorNome);
        idadePorNome.put("Ana", 32);  //atualiza o valor do mapa
        System.out.println("Nomes e idades no mapa: " + idadePorNome);

        //remover
        idadePorNome.remove("Paul");
        System.out.println("Nomes e idades no mapa: " + idadePorNome);

        //iterando
        System.out.println("Iterando ...");
        for (Map.Entry<String, Integer> entrada : idadePorNome.entrySet()) {
            System.out.println("Nome: " + entrada.getKey() + ", Idade: " + entrada.getValue());
        }

        //buscando uma chave específica
        boolean contemPaul = idadePorNome.containsKey("Paul");
        System.out.println("O mapa contém o nome Paul? " + contemPaul);

        boolean contemIdade32 = idadePorNome.containsValue(32);
        System.out.println("Existe alguém cadastrado com idade de 32 anos? " + contemIdade32);

        //tamanho
        int tamanho = idadePorNome.size();
        System.out.println("Tamanho do mapa: " + tamanho + " contém estes dados.");

        //limpando
        idadePorNome.clear();
        System.out.println("Dados: " + idadePorNome);



    }
}
