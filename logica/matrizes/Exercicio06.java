package logica.matrizes;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        6. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição ̃
        das matrizes lidas.
         */

        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.println("Insira um numero na posição " + i + "," + j);
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.println("Insira um numero na posição " + i + "," + j);
                matrizB[i][j] = scanner.nextInt();
            }
        }

        //compara
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if(matrizA[i][j] > matrizB[i][j]){
                    matrizC[i][j] = matrizA[i][j];
                }else {
                    matrizC[i][j] = matrizB[i][j];
                }
            }
        }

        System.out.println("Os maiores valores digitados foram:");
        for (int[] mat : matrizC) {
            for (int m : mat) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}