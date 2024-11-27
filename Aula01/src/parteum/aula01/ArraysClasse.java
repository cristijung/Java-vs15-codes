package parteum.aula01;

import java.util.Arrays;

public class ArraysClasse {
    public static void main(String[] args) {
        //criando o array
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros[0]); //acessando o primeiro elemento do Array
        numeros[2] = 28; //modifica o elemento do array - do índice 2 do array numeros
        System.out.println(Arrays.toString(numeros)); //mostra o array completo
        System.out.println(numeros[2]);

        //ordenando um array
        String[] ordenarArray = {"Pafúncio", "Esmeralda", "Ana Banana", "Cláudio", "Zaire"};
        System.out.println(Arrays.toString(ordenarArray));
        Arrays.sort(ordenarArray);  //sort ordena o Array
        System.out.println("Array ordenado: " + Arrays.toString(ordenarArray));

        //comparar um array
        int[] arrayUm = {1, 2, 3, 4};
        int[] arrayDois = {1, 2, 3, 4};
        System.out.println("Os arrays são iguais? " + Arrays.equals(arrayUm, arrayDois));

        //arrays multidimensionais -- matrizes
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[1].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }


    }
}
