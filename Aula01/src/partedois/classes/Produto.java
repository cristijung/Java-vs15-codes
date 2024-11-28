//Modificadores de
//visibilidade dos atributos

package partedois.classes;

public class Produto {
    //atributos privados
    private String nome;
    private double preco;

    //protegido
    protected int quantidade;

    //public
    public  String categoria;

    //construtor
    public Produto(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

}
