package logica.array;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[6];
        int maior = 0, menor = 0, posicaoMaior = 0, posicaoMenor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();

            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
                posicaoMaior = i;
                posicaoMenor = i;
            } else if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            } else if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }
        System.out.println(maior + " foi o maior número digitado e está na posição " + posicaoMaior);
        System.out.println(menor + " foi o menor número digitado e está na posição " + posicaoMenor);
        scanner.close();
    }
}