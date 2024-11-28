//classe com construtor vazio
package partedois.classes;

import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    int anoPubli;

    public Livro() {
    }

    //métodos para infos
public void lerInfos() {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o título do livro: ");
    this.titulo = ler.nextLine();

    System.out.println("Digite o autor do livro: ");
    this.autor = ler.nextLine();

    System.out.println("Digite o ano de publicação do livro: ");
    this.anoPubli = ler.nextInt();
}
    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPubli);
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro();
        meuLivro.lerInfos();
        meuLivro.exibirInformacoes();
    }

    }