package partetres.generics.ex1;


public class Util {
    //método genérico imprimirArray
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
}
