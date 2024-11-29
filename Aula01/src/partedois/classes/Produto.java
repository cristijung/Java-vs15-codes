//Modificadores de
//visibilidade dos atributos
//get para obter
//set para salvar, configurar, gravar
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

    //métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Categoria: " + categoria);
    }

}
