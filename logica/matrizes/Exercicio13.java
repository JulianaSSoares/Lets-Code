package logica.matrizes;

import java.util.Random;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        13. Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme a matriz gerada
        numa matriz triangular inferior, ou seja, atribuindo zero a todos os elementos acima da diagonal principal.
        Imprima a matriz original e a matriz transformada.
         */

        Random random = new Random();
        int[][] matriz = new int[4][4];
        int[][] matrizTriangular = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(20);
                matrizTriangular[i][j] = matriz[i][j];
            }
        }

        System.out.println("Matriz Original");
        for (int[] m : matriz) {
            for (int mat : m) {
                System.out.printf("%2d", mat);
            }
            System.out.println();
        }

        System.out.println("Matriz Triangular Inferior");
        for (int i = 0; i < matrizTriangular.length; i++) {
            for (int j = 0; j < matrizTriangular.length; j++) {
                if (i < j) {
                    matrizTriangular[i][j] = 0;
                }
                System.out.printf("%2d", matrizTriangular[i][j]);
            }
            System.out.println();
        }
    }
}