package partedois.classes.sobrecargass;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    // Construtor sem parâmetros
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.ano = 0;
    }

    // Construtor com título
    public Livro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconhecido";
        this.ano = 0;
    }

    // Construtor com título e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = 0;
    }

    // Construtor com título, autor e ano
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
