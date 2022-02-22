package logica.array;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas [] = new double[4];
        double media = 0;

        for (int i=0; i <notas.length; i++){
            System.out.println("Insira a nota:");
            notas [i] = scanner.nextDouble();
            media += notas[i]; //soma o conteúdo das posições
        }

        System.out.println("As notas digitadas foram:");
        for (double nota:notas) {
            System.out.printf("%.2f " , nota);
        }
        System.out.println("\nA média das notas digitadas são:");
        System.out.printf("%.2f ",media/ notas.length);
    }
}