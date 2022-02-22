package logica.matrizes;

import java.util.concurrent.ThreadLocalRandom;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
        15. Leia uma matriz 5 x 10 que se refere respostas de 10 questoes de múltipla escolha, referentes a 5 alunos.
        Leia tambem um vetor de 10 posições contendo o gabarito de respostas que podem ser a, b, c ou d.
        Seu programa deverá comparar as respostas de cada candidato com o gabarito e emitir um vetor denominado resultado,
        contendo a pontuação correspondente a cada aluno.
         */

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        char[][] respostas = new char[5][10];
        int[] resultado = new int[5];
        char[] gabarito = {'A', 'A', 'C', 'D', 'B', 'B', 'D', 'C', 'A', 'D'};
        int inicio = 65, fim = 68;

        //gerando respostas
        for (int i = 0; i < respostas.length; i++) {
            resultado[i] = 0;
            for (int j = 0; j < respostas[i].length; j++) {
                respostas[i][j] = (char) threadLocalRandom.nextInt(inicio, fim + 1);
            }
        }
        System.out.println("Respostas:");
        for (char [] resp : respostas) {
            for (char r : resp) {
                System.out.printf("%2s ", r);
            }
            System.out.println();
        }
        System.out.println("\nGabarito:");
        for (char gab : gabarito) {
            System.out.printf("%2s ", gab);
        }

        System.out.println("\n\nPontuação:");
        for (int i = 0; i < respostas.length; i++) {
            resultado[i] = 0;
            for (int j = 0; j < respostas[i].length; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    resultado[i]++;
                }
            }
            System.out.printf("Nota Final Aluno %d: %d \n" , (i+1), resultado[i]);
        }
    }
}