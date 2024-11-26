//Array de Objetos

package parteum;

public class LivrosClasse {
    //atributos
    String titulo;
    String autor;
    int anoPubicacao;

    //construtor
    //responsável por incializar os atributos
    public LivrosClasse(String titulo, String autor, int anoPubicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubicacao = anoPubicacao;
    }
}

class ArrayDeObjetos {
    public static void main(String[] args) {
        LivrosClasse[] estante = new LivrosClasse[3];

        //criar as instâncias do LivroClasse
        estante[0] = new LivrosClasse("It", "Stephen King", 1973);
        estante[1] = new LivrosClasse("1984", "George Owel", 1950);
        estante[2] = new LivrosClasse("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1908);

        for (int i = 0; i < estante.length; i++) {
            System.out.println("Livro " + (i + 1) + ":");
            System.out.println("Título " + estante[i].titulo);
            System.out.println("Autor " + estante[i].autor);
            System.out.println("Ano de Publicação " + estante[i].anoPubicacao);
            System.out.println("---------------------------");
        }
    }
}
