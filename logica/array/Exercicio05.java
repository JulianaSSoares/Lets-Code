package logica.array;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[5];
        int par[] = new int[5];
        int impar[] = new int[5];
        int num = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                par[i] = numeros[i];
            }else{
                impar[i] = numeros[i];
            }
        }
        scanner.close();

        for (int nums : numeros) {
            System.out.print(" " + nums);
        }
        System.out.println(" ");
        for (int pares : par) {
            System.out.print(" " + pares);
        }
        System.out.println(" ");
        for (int impares : impar) {
            System.out.print(" " + impares);
        }

    }
}