package partetres.collections.exsimples;

import java.util.Map;
import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> precoPorFruta = new TreeMap<>();

        //add
        precoPorFruta.put("Banana", 2.99);
        precoPorFruta.put("Maçã", 2.99);
        precoPorFruta.put("Laranja", 6.99);
        precoPorFruta.put("Melancia", 4.99);
        precoPorFruta.put("Goiaba", 4.78);

        //exibir
        System.out.println("Preço das Frutas: " + precoPorFruta);

        //remover
        precoPorFruta.remove("Laranja");
        System.out.println("Preço das Frutas: " + precoPorFruta);

        //Iterando
        System.out.println("Iterando ...");
        for (Map.Entry<String, Double> entrada : precoPorFruta.entrySet())
        System.out.println("Fruta: " + entrada.getKey() + "Preço: " + entrada.getValue());

        //buscando um dado específico
        boolean contemLaranja = precoPorFruta.containsKey("Laranja");
        System.out.println("Contém Laranja? " + contemLaranja);

        boolean contemPreco299 = precoPorFruta.containsValue(2.99);
        System.out.println("Tem preço de R$2.99? " + contemPreco299);

        //buscando primeira e última chava do mapa
        String primeiraFruta = precoPorFruta.firstKey();
        String ultimaFruta = precoPorFruta.lastKey();
        System.out.println("Primeira fruta: " + primeiraFruta);
        System.out.println("Última fruta: " + ultimaFruta);

        //limpar
        precoPorFruta.clear();
        System.out.println("Quantas frutas temos? "  + precoPorFruta);
    }
}
