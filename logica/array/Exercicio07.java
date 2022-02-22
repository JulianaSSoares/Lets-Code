package logica.array;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        int multiplicacao[] = new int[5];
        int soma[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um número:");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Os números digitados foram:");
        for (int num : numeros
        ) {
            System.out.print(" " + num);
        }
        System.out.println(" ");
        System.out.println("A mulltiplicação dos números digitados são:");
        for (int i = 0; i < numeros.length; i++) {
            multiplicacao[i] = numeros[i] * numeros[i];
            System.out.print(" " + multiplicacao[i]);
        }
        System.out.println(" ");
        System.out.println("A soma dos números digitados é:");
        for (int i = 0; i < numeros.length; i++) {
            soma[i] = numeros[i] + numeros[i];
            System.out.print(" " + soma[i]);
        }
        scanner.close();
    }
}