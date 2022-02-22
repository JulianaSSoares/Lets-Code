package logica.array;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[6];
        int contadorPar = 0, contadorImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("\nForam digitados " + contadorPar + " números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(" " + numeros[i]);
            }
        }
        System.out.println("\nForam digitados " + contadorImpar + " números impares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1) {
                System.out.print(" " + numeros[i]);
            }
        }
        scanner.close();
    }
}