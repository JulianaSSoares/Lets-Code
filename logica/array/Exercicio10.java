package logica.array;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[20];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + " da primeira sequéncia de 10 números:");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + " da segunda sequéncia de 10 números:");
            vetor2[i] = scanner.nextInt();
        }
        int posicao = 0;
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[posicao] = vetor1[i];
            posicao += 2;
        }
        posicao = 1;
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[posicao] = vetor2[i];
            posicao += 2;
        }
        for (int vet : vetor3
        ) {
            System.out.print(" " + vet);
        }
        scanner.close();
    }
}