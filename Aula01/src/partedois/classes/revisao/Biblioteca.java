package partedois.classes.revisao;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
        private final String nome;
        //declarando uma lista chamada livros para armazenar os objetos da classe Livro
        private ArrayList<Livro> livros;

        public Biblioteca(String nome) {
            this.nome = nome;
            this.livros = new ArrayList<>();
        }

        //método para cadastrar os livros
        public void cadastrarLivro(Livro livro) {
            this.livros.add(livro);
        }

        //método para pesquisar livro
        public void pesquisarLivro(String isbn) {
            for (Livro livro : livros) {
                if (livro.getIsbn().equals(isbn)) {
                    System.out.println("Livro encontrado: \n" + livro);
                    return;
                }
            }
            System.out.println("Livro não encontrado");
        }
        //método para excluir livro
        public void excluirLivro(String isbn) {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getIsbn().equals(isbn)) {
                    livros.remove(i);
                    System.out.println("Livro excluido com sucesso");
                    return;
                }
            }
            System.out.println("Livro não encontrado");
    }
    //método para editar o livros
    public void editarLivro(String isbn, Livro novoLivro)  {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getIsbn().equals(isbn)) {
                    livros.set(i, novoLivro);
                    System.out.println("Livro editado com sucesso.");
                    return;
                }
            }
        System.out.println("Livro não encontrado");
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Minha Biblioteca");

        while (true) {
            System.out.println("\n ---- Menu ----");
            System.out.println("1. Cadastrar Livros");
            System.out.println("2. Pesquisar Livros");
            System.out.println("3. Excluir Livros");
            System.out.println("4. Editar Livros");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Título: ");
                    String titulo = ler.nextLine();
                    System.out.println("Autor: ");
                    String autor = ler.nextLine();
                    System.out.println("Ano de Publicação: ");
                    int anoPublicacao = ler.nextInt();
                    ler.nextLine();
                    System.out.println("ISBN: ");
                    String isbn = ler.nextLine();

                    Livro livro = new Livro(titulo, autor, anoPublicacao, isbn);
                    biblioteca.cadastrarLivro(livro);
                    System.out.println("Livro Cadastrado com Sucesso.");
                    break;
                case 2:
                    System.out.println("ISBN do Livro para pesquisa: ");
                    String isbnPesquisa = ler.nextLine();
                    biblioteca.pesquisarLivro(isbnPesquisa);
                    break;
                case 3:
                    System.out.println("ISBN do Livro para excluir: ");
                    String isbnExcluir = ler.nextLine();
                    biblioteca.excluirLivro(isbnExcluir);
                    break;
                    case 4:
                        System.out.println("ISBN do Livro a editar: ");
                        String isbnEditar = ler.nextLine();
                        System.out.println("Novo Título: ");
                        String novoTitulo = ler.nextLine();
                        System.out.println("Novo Autor: ");
                        String novoAutor = ler.nextLine();
                        System.out.println("Novo Ano de Publicação: ");
                        int novoAnoPublicacao = ler.nextInt();
                        ler.nextLine();
                        System.out.println("Novo ISBN: ");
                        String novoISBN = ler.nextLine();

                        Livro novoLivro = new Livro(novoTitulo, novoAutor, novoAnoPublicacao, novoISBN);
                        biblioteca.editarLivro(isbnEditar, novoLivro);
                        break;
                case 5:
                    System.out.println("Saindo .......");
                    ler.close();
                    return;
                default:
                    System.out.println("Opção Inválida!!");

            }


        }


    }


}
