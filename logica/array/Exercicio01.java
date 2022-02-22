package logica.array;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*

         */
        Scanner scanner = new Scanner(System.in);
        int [] numero= new int [5];

        for(int i=0; i<5; i++){
            System.out.println("Digite um número: ");
            numero [i] = scanner.nextInt();
        }
        scanner.close();
        for (int i=0; i<5; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}