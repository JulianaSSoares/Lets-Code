package logica.array;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i=0; i < numeros.length;i++){
            System.out.println("Digite um número");
            numeros[i] = scanner.nextInt();
            numeros[i] *=2;
        }
        System.out.println("O quadrado dos números digitados é:");
        for (int nums: numeros) {
            System.out.print(" " + nums);
        }
        scanner.close();
    }
}
