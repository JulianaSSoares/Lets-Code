package logica.matrizes;

import java.util.Random;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
        14. Faça um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de bingo.
        Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes dados  de modo a
        nao ter números repetidos dentro das cartelas. O programa deve exibir na  tela a cartela gerada.
         */

        Random random = new Random();

        int numeros = random.nextInt(100);
        int[][] cartela = new int[5][5];

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela.length; j++) {
                cartela[i][j] = numeros;
                if(numeros == numeros){
                    cartela[i][j] = random.nextInt(100);
                }
            }
        }

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela.length; j++) {
                System.out.printf("%4d" , cartela[i][j]);
            }
            System.out.println();
        }
    }
}