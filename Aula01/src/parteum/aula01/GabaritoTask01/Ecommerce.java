package parteum.aula01.GabaritoTask01;

import java.util.Scanner;
// algoritmo OITO

public class Ecommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto, descricaoProduto;
        double precoProduto;
        int estoqueProduto;

        System.out.println("Cadastro de Produto:");
        System.out.print("Nome do Produto: ");
        nomeProduto = scanner.nextLine();

        System.out.print("Descrição do Produto: ");
        descricaoProduto = scanner.nextLine();

        System.out.print("Preço do Produto: R$");
        precoProduto = scanner.nextDouble();

        System.out.print("Estoque Disponível: ");
        estoqueProduto = scanner.nextInt();

        System.out.println("\nDetalhes do Produto Cadastrado:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Descrição: " + descricaoProduto);
        System.out.println("Preço: R$" + precoProduto);
        System.out.println("Estoque Disponível: " + estoqueProduto);

        System.out.println("\nPromoção - Desconto Percentual:");
        System.out.print("Informe o percentual de desconto (%): ");
        double percentualDesconto = scanner.nextDouble();

        double precoComDesconto = precoProduto - (precoProduto * (percentualDesconto / 100.0));

        System.out.printf("\nPreço com Desconto de %.2f%%: R$%.2f\n", percentualDesconto, precoComDesconto);

        scanner.close();
    }
}

