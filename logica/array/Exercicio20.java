package logica.array;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero[] = new int[5];
        double altura[] = new double[5];
        int numeroMaisAlto = 0;
        double alturaMaisAlto = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o número do jogador:");
            numero[i] = scanner.nextInt();
            System.out.println("Digite a altura do jogador:");
            altura[i] = scanner.nextDouble();

            if (i == 0) {
                numeroMaisAlto = numero[i];
                alturaMaisAlto = altura[i];
            } else if (altura[i] > alturaMaisAlto) {
                numeroMaisAlto = numero[i];
                alturaMaisAlto = altura[i];
            }
        }
        System.out.println("O jogador mais alto tem " + alturaMaisAlto + " de altura e usa a camisa " + numeroMaisAlto);
        scanner.close();
    }
}