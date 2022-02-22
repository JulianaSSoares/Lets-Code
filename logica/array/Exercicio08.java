package logica.array;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade [] = new int[5];
        double altura[] = new double[5];

        for (int i=0; i<idade.length;i++){
            System.out.println("Digite sua idade: ");
            idade[i] = scanner.nextInt();
            System.out.println("Digite sua altura: ");
            altura[i] = scanner.nextDouble();
        }

        for (int i=4; i<idade.length;i--){
            System.out.println(idade[i]);
            System.out.println(altura[i]);
        }
        scanner.close();
    }
}