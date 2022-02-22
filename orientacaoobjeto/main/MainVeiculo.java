package orientacaoobjeto.main;

import orientacaoobjeto.classes.Veiculo;
import java.util.Scanner;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Scanner scanner = new Scanner(System.in);

        int opcao, adicionaVelocidade = 0;
        System.out.println("Informe o Modelo do Veículo:");
        veiculo.setModelo(scanner.nextLine());
        System.out.println("Informe a Marca do Veículo:");
        veiculo.setMarca(scanner.nextLine());
        System.out.println("Informe o Ano do Veículo:");
        veiculo.setAno(scanner.nextInt());
        System.out.println("Informe a Velocidade Máxima:");
        veiculo.setVelocidadeMáxima(scanner.nextInt());
        System.out.println("Informe a Velocidade Atual:");
        veiculo.setVelocidadeAtual(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe a Cor do Veículo:");
        veiculo.setCor(scanner.nextLine());
        System.out.println("Informe o Valor do Veículo na Tabela FIPE:");
        veiculo.setValorFIPE(scanner.nextFloat());

        System.out.println(veiculo.menu());
        opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Informe a Velocidade a Ser Adicionada");
            adicionaVelocidade = scanner.nextInt();

            veiculo.acelerar(adicionaVelocidade, opcao);
        } else if (opcao == 2) {
            veiculo.frear();
        } else {
            System.out.println("Opção Inválida! Escolha novamente:");
            veiculo.menu();
        }
        scanner.close();
    }
}