package partetres.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SistemaFarmacia {

    //enum
    enum CategoriaMedicamento {
        GENERICO, REFERENCIA, SIMILAR
    }

    //classe
    static class Medicamento {
        String nome;
        CategoriaMedicamento categoria;
        double preco;

        public Medicamento(String nome, CategoriaMedicamento categoria, double preco) {
            this.nome = nome;
            this.categoria = categoria;
            this.preco = preco;
        }

        //método toString é responsável pela representação textual do objeto
        @Override
        public String toString() {
            return "Nome: 1 " + nome +
                    ", Categoria: " + categoria +
                    ", Preço: " + preco;
        }

        //classe Main
        public static void main(String[] args) {
            //criando a lista de medicamentos
            List<Medicamento> medicamentos = new ArrayList<>(Arrays.asList(
                    new Medicamento("Dipirona", CategoriaMedicamento.GENERICO, 24.90),
                    new Medicamento("Paracetamol", CategoriaMedicamento.GENERICO, 14.99),
                    new Medicamento("Novalgina", CategoriaMedicamento.REFERENCIA, 44.99),
                    new Medicamento("Tylenol", CategoriaMedicamento.REFERENCIA, 35.99),
                    new Medicamento("Qualquer genérico de Novalgina", CategoriaMedicamento.SIMILAR, 12.99),
                    new Medicamento("Qualquer genérico de Tylenol", CategoriaMedicamento.SIMILAR, 9.99)
            ));

            //filtar a lista de medicamentos
            List<Medicamento> genericos = medicamentos.stream()
                    .filter(m -> m.categoria == CategoriaMedicamento.GENERICO)
                    .toList();
            System.out.println("Medicamentos genéricos na farmácia: " + genericos);

            //calcular a média de preços do medicamentos de referencia
            double soma = 0;
            long contar = 0;
            for (Medicamento medicamento : medicamentos) {
                if (medicamento.categoria == CategoriaMedicamento.REFERENCIA) {
                    double preco = medicamento.preco;
                soma += preco;
                contar++;
            }
        }
            double mediaPrecoReferencia = contar > 0 ? soma / contar : 0.0; //operador ternário
            System.out.println("Média de preço dos medicamentos de referência: " + mediaPrecoReferencia);

            //buscar o medicamento similar mais caro
            Medicamento similarMaisCaro = medicamentos.stream()
                    .filter(m -> m.categoria == CategoriaMedicamento.SIMILAR)
                    .max(Comparator.comparingDouble(m -> m.preco))
                    .orElse(null);
            System.out.println("Medicamento similar mais caro: " + similarMaisCaro);

            //ordem alfabética dos medicamentos
            medicamentos.stream()
                    .map(m -> m.nome)
                    .sorted()
                    .forEach(System.out::println);
        }

    }
}

//sintaxe de uma função lambda
// arrow function
// (parametro) -> expressão
// (parametro) -> {bloco de código}
//(int a, int b) -> a + b
