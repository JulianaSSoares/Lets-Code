package logica.array;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor1[] = new int[3];
        int vetor2[] = new int[3];
        int vetor3[] = new int[3];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número para o 1 vetor:");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite um número para o 2 vetor:");
            vetor2[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] - vetor2[i];

            if (vetor3[i] % 2 == 1) {
                System.out.println(vetor3[i]);
            }
        }
        scanner.close();
    }
}