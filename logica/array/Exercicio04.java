package logica.array;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra[] = new char[10];
        char consoante[] = new char[10];

        int count=0;
/*
REFAZER
 */
        for (int i = 0; i < letra.length; i++) {
            System.out.println("Digite uma letra:");
            letra[i] = scanner.next().charAt(0);

            switch(letra[i]) {

                case 'a':
                    continue;
                case 'e':
                    continue;
                case 'i':
                    continue;
                case 'o':
                    continue;
                case 'u':
                    continue;
                case 'A':
                    continue;
                case 'E':
                    continue;
                case 'I':
                    continue;
                case 'O':
                    continue;
                case 'U':
                    continue;
                default:
                    consoante[i] = letra[i];
                    count++;
            }
        }
        scanner.close();
        System.out.println(count);

        for (char c : consoante) {
            System.out.println(c);
        }
    }
}