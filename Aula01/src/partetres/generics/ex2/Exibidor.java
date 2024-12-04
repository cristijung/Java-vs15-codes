package partetres.generics.ex2;
//método genérico
public class Exibidor {
    public static <T> void exibirValor(Arnazenador<T> arnazenador) {
        System.out.println("Valor armazenado: " + arnazenador.obterValor());
    }
}
