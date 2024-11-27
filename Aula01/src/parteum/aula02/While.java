//WHILE -- enquanto: condição é verificada desde o início do loop´. se a condição for falsa desde o início
//o bloco de código NUNCA SERÁ EXECUTADO

package parteum.aula02;

public class While {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        System.out.println("Fim do Programa!");
    }
}
