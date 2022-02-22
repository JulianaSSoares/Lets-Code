package logica.array;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
Faça um algoritmo que, dado um vetor de 50 números, imprimi-lo na ordem inversa à da leitura.         */

        int numeros[] = new int[50];
        for (int i=0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i= numeros.length-1; i>0;i--){
            System.out.print(" " + numeros[i]);
        }
        scanner.close();
    }
}