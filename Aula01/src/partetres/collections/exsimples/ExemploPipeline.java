package partetres.collections.exsimples;

import java.util.Arrays;
import java.util.List;

public class ExemploPipeline {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Camisa", 50.0, false),
                new Produto("Calça", 80.0, true),
                new Produto("Tênis", 120.0, false),
                new Produto("Boné", 20.0, true)
        );

        //cálculo da média do preço dos produtos em promoção
        double mediaPrecoPromocao = produtos.stream()
                .filter(Produto::isPromocao)
                .mapToDouble(Produto::getPreco)
                .average()
                .orElse(0.0);

        System.out.println("Média do preço dos produtos em promoção: " + mediaPrecoPromocao);
    }

    //aqui está a outra classeeee ------------------------------------------------------
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

