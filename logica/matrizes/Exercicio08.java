package logica.matrizes;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        8. Leia uma matriz 3x3, calcule a soma dos elementos que estao acima da diagonal principal.
         */
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número para a posição: " + i + j);
                matriz[i][j] = scanner.nextInt();
                if (i < j) {
                    soma += matriz[i][j];
                }
            }
        }

        for (int[] m : matriz) {
            for (int mat : m){
                System.out.printf("%4d" , mat);
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos que estão acima da diagonal principal é: " + soma);
    }
}