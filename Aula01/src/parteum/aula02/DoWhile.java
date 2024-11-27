//do while (faça tal coisa até chegar em uma condição)
//A condição é VERIFICADA NO FINAL DO LOOP, isso quer dizer que
//o bloco de código que está no DO, será sempre executado pelo menos 1 vez
package parteum.aula02;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int option;

        //faça a criação do menu
        do {
            System.out.println("Menu: ");
            System.out.println("1. Opção 1: ");
            System.out.println("2. Opção 2: ");
            System.out.println("0. Sair: ");
            System.out.println("Escolha uma opção: ");
            option = ler.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Você escolheu a opção 1.");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2.");
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 0);  //enquanto a opção escolhida for diferente de zero
    }
}
