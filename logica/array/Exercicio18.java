package logica.array;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior=0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();

            if (i==0){
                maior=vetor[i];
            } else if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        scanner.close();
        System.out.println("maior = " + maior);
    }
}