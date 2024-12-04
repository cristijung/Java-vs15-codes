package partetres.generics.ex2;

public class ArmazenadorSimples<T> implements Arnazenador<T> {
    private T valor;

    @Override
    public void armazenar(T valor) {
        this.valor = valor;
    }

    @Override
    public T obterValor() {
        return valor;
    }
}
