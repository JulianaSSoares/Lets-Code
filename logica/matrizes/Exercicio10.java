package logica.matrizes;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        10. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao na diagonal principal.
        */
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número para a posição: " + i + j);
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    soma +=matriz[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos que estão na diagonal principal é: " + soma);
    }
}