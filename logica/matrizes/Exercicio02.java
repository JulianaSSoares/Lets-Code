package logica.matrizes;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        2. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos.
        Escreva ao final a matriz obtida
         */

        int [][] matriz = new int[5][5];

        for (int i=0; i<matriz.length;i++){
            for (int j=0;j< matriz.length;j++){
                if(i==j){
                    matriz[i][j]=1;
                }
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
