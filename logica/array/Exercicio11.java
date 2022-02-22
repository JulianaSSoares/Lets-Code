package logica.array;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Altere o programa anterior, intercalando 3 vetores de 10 elementos cada
         */
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];
        int vetor4[] = new int[30];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + " da 1ª sequéncia de 10 números:");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + " da 2ª sequéncia de 10 números:");
            vetor2[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + " da 3ª sequéncia de 10 números:");
            vetor3[i] = scanner.nextInt();
        }

        int posicao = 0;
        for (int i = 0; i < vetor1.length; i++) {
            vetor4[posicao] = vetor1[i];
            posicao += 3;
        }
        posicao = 1;
        for (int i = 0; i < vetor1.length; i++) {
            vetor4[posicao] = vetor2[i];
            posicao += 3;
        }
        posicao = 2;
        for (int i = 0; i < vetor1.length; i++) {
            vetor4[posicao] = vetor3[i];
            posicao += 3;
        }
        for (int vet : vetor4) {
            System.out.print(" " + vet);
        }
        scanner.close();
    }
}