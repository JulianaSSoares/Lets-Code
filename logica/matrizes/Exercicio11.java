package logica.matrizes;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        11. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao na diagonal secundaria.
         */
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número para a posição: " + i + j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                if (i + j == matriz.length - 1) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos que estão na diagonal principal é: " + soma);
    }
}