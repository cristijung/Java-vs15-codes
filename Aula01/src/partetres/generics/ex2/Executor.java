package partetres.generics.ex2;

public class Executor {
    public static void main(String[] args) {
        Arnazenador<String> arnazenadorDeString = new ArmazenadorSimples<>();
        Arnazenador<Integer> armazenadorDeInteiro = new ArmazenadorSimples<>();

        arnazenadorDeString.armazenar("Oi, eu sou string");
        armazenadorDeInteiro.armazenar(456);

        Exibidor.exibirValor(arnazenadorDeString);
        Exibidor.exibirValor(armazenadorDeInteiro);
    }
}
