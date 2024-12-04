package partetres.collections.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Produto> produtos = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar preço do produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Listar todos os produtos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    Produto novoProduto = new Produto(codigo, nome, preco);
                    produtos.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    codigo = scanner.nextLine();
                    Produto produto = encontrarProdutoPorCodigo(produtos, codigo);
                    if (produto != null) {
                        System.out.print("Digite o novo preço do produto: ");
                        preco = scanner.nextDouble();
                        scanner.nextLine();
                        produto.setPreco(preco);
                        System.out.println("Preço atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do produto: ");
                    codigo = scanner.nextLine();
                    produto = encontrarProdutoPorCodigo(produtos, codigo);
                    if (produto != null) {
                        produtos.remove(produto);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Lista de produtos:");
                    for (Produto p : produtos) {
                        System.out.println(p);
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static Produto encontrarProdutoPorCodigo(TreeSet<Produto> produtos, String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }
}
