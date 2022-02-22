package logica.array;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeros[] = new double[10];
        int contador=0;
        double soma=0;

        for (int i=0; i < numeros.length;i++){
            System.out.println("Digite um valor: ");
            numeros[i] = scanner.nextDouble();

            if (numeros[i] >= 0){
                soma +=numeros[i];
            }else {
                contador++;
            }
        }
        System.out.printf("A soma dos números digitados é: %.2f ",soma);
        System.out.println("\nForam digitados " + contador + " números negativos.");
        scanner.close();
    }
}