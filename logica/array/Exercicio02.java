package logica.array;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    /*
    2. Faça um programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
    */

        Scanner scanner = new Scanner(System.in);
        double[] numero = new double[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            numero[i] = scanner.nextDouble();
        }
        scanner.close();
        for (int i = 9; i >= 0; i--) {
            System.out.print(numero[i] + " ");
        }
    }
}
