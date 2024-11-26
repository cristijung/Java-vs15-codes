package parteum;

public class Condicionais {
    //definindo um atributo estático e privado (oculto)
    //do tipo Condicionais
    private static Condicionais condicionais;

    //método exemploIfElse
    public void exemploIfElse(int a) {
        if (a > 15) {
            System.out.println("a é maior do que 15");
        } else {
            System.out.println("a é menor do que 15");
        }
    }

    //método de exemplo de ElseIf
    public void exemploElseIf(int b) {
        if (b > 18) {
            System.out.println("b é maior que 18");
        }else if (b > 14) {
            System.out.println("b é maior que 14 e não maior que 18");
        } else {
            System.out.println("b não é maior que 14");
        }
    }

    //a main
    //inicializa a var estática condicionais com uma nova
    //instância de classe Condicionais
    public static void main(String[] args) {
        Condicionais condicionais = new Condicionais();
        //chama o método da instância criada e estamos passando
        //um valor 20
        condicionais.exemploIfElse(20);
        condicionais.exemploElseIf(10);

    }
}
