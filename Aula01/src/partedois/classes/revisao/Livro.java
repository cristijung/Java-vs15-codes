package partedois.classes.revisao;

public class Livro {
    public String titulo;
    public String autor;
    private int anoPublicacao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //esta anotação indica ao compilador q este método será sobrescrito e
    //ajuda a evitar erros criando por engano um novo método
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de Publicação: " + anoPublicacao + "\n" +
                "ISBN: " + isbn;
    }
}
