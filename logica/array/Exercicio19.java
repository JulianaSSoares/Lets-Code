package logica.array;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int vetor3[] = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número para o 1ª vetor ");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++){
            System.out.println("Digite um número para o 2ª vetor ");
            vetor2[i] = scanner.nextInt();
        }
        System.out.println("vetor3 = ");
        for (int i = 0; i < vetor1.length; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.print(" " + vetor3[i]);
        }
        scanner.close();
    }
}