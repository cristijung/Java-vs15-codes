package partetres.generics.ex1;

public class Caixa<T> {
    private T conteudo;

    public Caixa() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public static void main(String[] args) {
        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.setConteudo("Oi povo, neste momento eu sou uma String");
        System.out.println(caixaDeString.getConteudo());

        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        caixaDeInteiro.setConteudo(123456780);
        System.out.println(caixaDeInteiro.getConteudo());

    }
}
