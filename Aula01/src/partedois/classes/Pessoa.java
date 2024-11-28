//anatomia de uma classe
//uso da main só para fins de visualização
package partedois.classes;

//Nome da Classe
public class Pessoa {
    //Parte I da classe
    //atributos da classe Pessoa - características da pessoa
    String nome;
    public String endereco;
    public int idade;
    public double peso;

    //Parte II da classe
    //Construtor da classe
    //Construtor da classe recebe os parâmetros e inicializa os atributos
    public Pessoa(String nome, String endereco, int idade, double peso) {
        this.nome = nome; //this se refere ao atributo da classe nome se refere ao parâmetro do construtor
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
    }

    //Parte III da classe
    //Métodos
    public void falar() {
        System.out.println("Olá tudo bom");
    }

    public void dormir() {
        System.out.println("Estou dormindo");
    }

    public void comer() {
        System.out.println("Estou me alimentando");
    }

    public  void exibirInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso:" + this.peso);
    }

    public static void main(String[] args) {
        //criando duas pessoas (dois objetos) a partir da classe pessoa
        Pessoa umaPessoa = new Pessoa("Ana", "Rua: ABC", 32, 75.98);
        Pessoa duasPessoa = new Pessoa("Josefino", "Rua: DER", 56, 89.99);

        //exibir as infos
        umaPessoa.exibirInfos();
        duasPessoa.exibirInfos();

        //chamando os outros métodos
        umaPessoa.comer();
        duasPessoa.dormir();
        duasPessoa.falar();
        umaPessoa.comer();

    }

}
