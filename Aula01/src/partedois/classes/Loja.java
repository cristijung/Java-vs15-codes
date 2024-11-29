package partedois.classes;

public class Loja {
    public static void main(String[] args) {
        //criar um objeto Produto da classe Produto
        Produto produto1 = new Produto("Notebook", 5899, 200, "Computadores");

        //acessar os atributos usando o método get
        System.out.println("Nome do Produto: " + produto1.getNome());
        System.out.println("Preço do Produto: " + produto1.getPreco());

        //acessar os atributos usando o método set
        produto1.setPreco(8999.99); //mudando o valor
        System.out.println("Novo preço do produto: " + produto1.getPreco()); //lendo o valor

        //mostrando detales
        produto1.mostrarDetalhes();

        Produto smartphone = new Produto("Smartphone", 15899.99, 150, "Celulares");
        smartphone.mostrarDetalhes();
    }
}
