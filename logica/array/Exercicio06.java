package logica.array;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double nota = 0;
        double media[] = new double[3];

        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a nota do " + (i + 1) + " aluno: ");
                nota = scanner.nextDouble();
                soma += nota;
                media[i] = soma / 4;
            }
        }
        scanner.close();
        for (int i = 0; i < 3; i++) {
            if (media[i] >= 7) {
                contador++;
            }
        }
        System.out.println(contador + " alunos tiveram nota média maior ou igual a 7.");
    }
}