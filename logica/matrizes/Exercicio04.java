package logica.matrizes;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        4. Leia uma matriz 4 x 4, imprima a matriz e retorne a localizacão (linha e a coluna) do maior valor.
         */
        Random random = new Random();

        int[][] matriz = new int[4][4];
        int linha=0, coluna=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
                if (matriz[i][j] > matriz[i][j]) {
                    linha=i;
                    coluna=j;
                }
            }
        }
        for (int [] mat : matriz) {
            for (int m: mat){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println(linha + " " + coluna);

    }
}
