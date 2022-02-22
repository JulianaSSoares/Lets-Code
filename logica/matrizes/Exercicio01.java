package logica.matrizes;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
    1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
     */

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int count=0;

        for (int i=0; i< matriz.length;i++){
            for (int j=0; j< matriz.length;j++){
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > 10){
                    count++;
                }
            }
        }
        scanner.close();
        System.out.println(count + " são maiores que 10");
    }
}