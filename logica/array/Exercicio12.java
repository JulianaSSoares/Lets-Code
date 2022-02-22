package logica.array;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade[] = new int[5];
        double altura[] = new double[5];
        double mediaAltura=0;
        int contador=0;

        for (int i=0; i < altura.length;i++){
            System.out.println("Informe a idade do aluno:");
            idade[i] = scanner.nextInt();

            System.out.println("Informe a altura do aluno:");
            altura[i] = scanner.nextDouble();
            mediaAltura +=altura[i]/5;

            if (idade[i] >=13 && altura[i] < mediaAltura){
                contador++;
            }
        }
        System.out.printf("A média de altura dos alunos é: %.2f\n" , mediaAltura);
        System.out.println(contador + " alunos maiores de 13 anos possuem altura menor que a média. ");


        scanner.close();
    }
}
