package logica.matrizes;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        3. Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da coluna de cada elemento.
        Em seguida, imprima na tela a matriz.
         */
        Random random = new Random();

        int [][] matriz = new int[2][2];

        for (int i=0; i< matriz.length;i++){
            for (int j=0; j< matriz.length;j++){
                matriz[i][j] = random.nextInt(10);
                matriz[i][j] = matriz[i][j] * matriz[i][j];
            }
        }

        for (int [] mat : matriz) {
            for (int m: mat){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
