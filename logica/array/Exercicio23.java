package logica.array;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vetor1[] = new double[4];
        double vetor2[] = new double[4];
        double vetor3[] = new double[8];
        int pesoA = 4, pesoB = 6;

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número para o 1 vetor:");
            vetor1[i] = scanner.nextDouble();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número para o 2 vetor:");
            vetor2[i] = scanner.nextDouble();
        }
        int posicao = 0;
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[posicao] = (vetor1[i] * pesoA) / (pesoA* vetor1.length);
            posicao++;
        }
        posicao = 4;
        for (int i = 0; i < vetor2.length-1; i++) {
            vetor3[posicao] = (vetor2[i] * pesoB) / (pesoB* vetor2.length);
            posicao++;
        }
        for (int i = vetor3.length-1; i>=0; i--) {
            System.out.printf(" %.2f" , vetor3[i]);
        }
        scanner.close();
    }
}