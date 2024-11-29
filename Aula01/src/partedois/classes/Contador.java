//exemplo de atributo static
package partedois.classes;

public class Contador {
    private static int count = 0;

    public Contador() {
        count ++;
    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println(Contador.count);

        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);
    }
}
