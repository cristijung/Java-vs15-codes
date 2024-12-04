package partetres.generics.ex2;

public interface Arnazenador<T> {
    void armazenar(T valor);
    T obterValor();
}
