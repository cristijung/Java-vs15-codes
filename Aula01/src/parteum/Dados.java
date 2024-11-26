package parteum;

public class Dados {
    public String nome = "Ana";
    String sobreNome = "Banana";
    public int idade = 35;
    public double altura = 1.75;

    public void exibirDados() {
        //exibindo os dados
        System.out.println("Nome completo: " + nome + " " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
