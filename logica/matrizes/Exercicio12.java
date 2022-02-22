package logica.matrizes;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        12. Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.
         */
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] matrizTransposta = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número para a posição: " + i + j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz Original");
        for (int[] m : matriz) {
            for (int mat : m) {
                System.out.printf("%2d", mat);
            }
            System.out.println();
        }
        System.out.println("\nMatriz Transposta");
        for (int[] m : matrizTransposta) {
            for (int mat : m) {
                System.out.printf("%2d", mat);
            }
            System.out.println();
        }
    }
}