package logica.array;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura[] = new double[5];
        double mediaAltura = 0;

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Digite a altura do jogador:");
            altura[i] = scanner.nextDouble();
            mediaAltura += altura[i] / altura.length;
        }
        System.out.printf("A média de altura do time é: %.2f " ,mediaAltura);
        scanner.close();
    }
}