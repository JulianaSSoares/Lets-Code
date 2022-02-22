package logica.matrizes;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        7. Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:  ̃
            A[i][j] = 2i + 7j − 2 se i < j
            A[i][j] = 4i³ − 5j² + 1 se i > j
            A[i][j] = 3i² − 1 se i = j
         */

        int[][] matrizA = new int[10][10];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                if (i < j) {
                    matrizA[i][j] = (((2 * i) + (7 * j)) - 2);
                } else if (i > j) {
                    matrizA[i][j] = (4 * ((int) Math.pow(i, 3))) - (5 * ((int) Math.pow(i, 2))) + 1;
                } else {
                    matrizA[i][j] = (3 * ((int) Math.pow(i, 2))) - 1;
                }
            }
        }

        for (int[] mat : matrizA) {
            for (int m : mat) {
                System.out.printf("%5d", m);
            }
            System.out.println();
        }
    }
}