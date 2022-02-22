package logica.array;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vetor1[] = new double[5];
        double vetor2[] = new double[5];
        double vetor3[] = new double[5];
        double vetor4[] = new double[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número:");
            vetor1[i] = scanner.nextDouble();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite  um número:");
            vetor2[i] = scanner.nextDouble();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número:");
            vetor3[i] = scanner.nextDouble();
        }
        for (int i = 0; i < vetor1.length; i++) {
            vetor4[i] = (vetor1[i] * vetor3[i]) / vetor2[i];
            System.out.print(" " + vetor4[i]);
        }
        scanner.close();
    }
}