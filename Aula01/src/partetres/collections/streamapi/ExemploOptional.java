package partetres.collections.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Camisa", 50.0, false),
                new Produto("Calça", 80.0, true),
                new Produto("Tênis", 120.0, false),
                new Produto("Boné", 20.0, true)
        );

        // aqui vai encontrar o preço do primeiro produto em promoção (ou 0 se não existir)
        Optional<Double> precoPromocao = produtos.stream()
                .filter(Produto::isPromocao)
                .findFirst()
                .map(Produto::getPreco);

        double precoFinal = precoPromocao.orElse(0.0); //retorna 0 se Optional estiver vazio

        System.out.println("Preço do primeiro produto em promoção: " + precoFinal);
    }

    private static class Produto {
        private String nome;
        private double preco;
        private boolean promocao;

        public Produto(String nome, double preco, boolean promocao) {
            this.nome = nome;
            this.preco = preco;
            this.promocao = promocao;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public boolean isPromocao() {
            return promocao;
        }
    }
}
