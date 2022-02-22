package logica.matrizes;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        5. Leia uma matriz 5 x 5. Leia tambem um valor X. O programa devera fazer uma busca desse valor na matriz e, ao final,
        escrever a localização (linha e coluna) ou uma mensagem de “nao encontrado”.
        */
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int valor = 0, posicao = 0, posicaoLinha = 0, posicaoColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Insira um numero para a linha " + i + " e coluna " + j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite um valor:");
        valor = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (valor == matriz[i][j]) {
                    posicaoLinha = i;
                    posicaoColuna = j;
                }
            }
        }

        if (valor == matriz[posicaoLinha][posicaoColuna]) {
            System.out.println("O valor foi encontrado na posição: " + posicaoLinha + "," + posicaoColuna);
        } else {
            System.out.println("Valor não encontrado!");
        }
    }
}