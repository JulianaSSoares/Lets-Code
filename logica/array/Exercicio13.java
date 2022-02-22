package logica.array;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         Faça   um   programa   que   receba   a   temperatura   média   de   cada   mês   do   ano
         e armazene-as   em   uma   lista.   Após   isto,   calcule   a   média   anual   das   temperaturas
         e mostre   todas   as   temperaturas   acima   da   média   anual,   e   em   que   mês   elas ocorreram
         (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
         */

        double temperaturaMedia[] = new double[12];
        double mediaAnual=0;
        String meses [] = {"1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril", "5 -Maio", "6 - Junho",
                "7 - Julho", "8 - Agosto", "9 - Setembro","10 -Outubro", "11 - Novembro","12 - Dezembro"};

        for (int i=0; i < temperaturaMedia.length; i++){
            System.out.println("Informe a temperatura média de " + meses[i] + " :");
            temperaturaMedia[i] = scanner.nextDouble();
            mediaAnual += temperaturaMedia[i]/ temperaturaMedia.length;

        }
        System.out.printf("A média anual de temperatura foi: %.2f \n" ,mediaAnual);
        System.out.println("Os meses abaixo tiveram temperaturas maior que a média anual: ");
        for (int i=0; i < temperaturaMedia.length; i++){
            if(temperaturaMedia[i] > mediaAnual){
                System.out.println(meses[i]);
            }
        }
        scanner.close();
    }
}